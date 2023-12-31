import React, {createContext, useContext, useState} from 'react';

const LanguageContext = createContext();

function LanguageProvider({children}) {
    const [lang, setLang] = useState('en');

    const switchLang = () => {
        setLang(prevLang => prevLang === 'en' ? 'ko' : 'en');
        //이전 상태를 체크 //만약 이전 언어가 'en'라면 'ko'로 바꿔줘
    };

    const handleChange = (event) => {
        setLang(event.target.value);
    }

    return (
        <LanguageContext.Provider value={{lang, switchLang, handleChange}}>
            {children}
        </LanguageContext.Provider>
    );
}

function SelectLang() {
    const {lang, handleChange} = useContext(LanguageContext);
    return (
        <select onChange={handleChange}>
            <option value="en">English</option>
            <option value="ko">한국어</option>
        </select>
    )
}

function SayHello() {
    const {lang} = useContext(LanguageContext);
    return <p> {lang === 'en' ? 'Hi' : '안뇽'} </p>;
}

function Language() {
    return (
        <>
            <h2>[언어 바꾸기]</h2>
            <LanguageProvider>
                <SelectLang />
                <SayHello />
            </LanguageProvider>
        </>
    );
}

export default Language;