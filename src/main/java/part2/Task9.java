package part2;

public class Task9 {
    public static void main(String[] args) {
        int day = 31;
        int month = 12;
        int year = 1800;
            makeNextDay(day,month,year);
        }

        public static void makeNextDay (int day, int month, int year) {
            System.out.println("Введённая дата: " + day + "/" + month + "/" + year);
                if (day<=0||month<=0||year<=0){
                    System.out.println("Быть такого не может!");
                    return;
                }
                if (month>12){
                    System.out.println("Месяцев всего 12");
                }else {
                    switch (month){
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                            if (day < 31) {
                                day++;
                            } else if (day == 31) {
                                day = 1;
                                month++;
                            }
                            else if (day>31){
                                System.out.println("В месяце " + month + " 31 день");
                                return;
                            }
                            break;
                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            if (day < 30) {
                                day++;
                            } else if (day == 30) {
                                day = 1;
                                month++;
                            }
                            else if (day>30){
                                System.out.println("В месяце " + month + " 30 дней");
                                return;
                            }
                            break;
                        case 2:
                            if (year % 4 != 0) {
                                if (day < 28) {
                                    day++;
                                } else if (day == 28) {
                                    day = 1;
                                    month++;
                                }
                                else if (day>28){
                                    System.out.println("В месяце 2 " + year + " года 28 дней");
                                    return;
                                }
                            } else {
                                if (day < 29) {
                                    day++;
                                } else if (day == 29) {
                                    day = 1;
                                    month++;
                                }
                                else if (day>29){
                                    System.out.println("В месяце 2 " + year + " года 29 дней");
                                    return;
                                }
                            }
                            break;
                        case 12:
                            if (day < 31) {
                                day++;
                            } else if (day == 31) {
                                day = 1;
                                month = 1;
                                year++;
                    }
                    }
                    System.out.println("Дата следующего дня: " + day + "/" + month + "/" + year);

                }


//            System.out.println("Введённая дата: " + day + "/" + month + "/" + year);
//                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
//                    if (day < 31) {
//                        day++;
//                    } else if (day == 31) {
//                        day = 1;
//                        month++;
//                    }
//                    else if (day>31){
//                        System.out.println("В месяце " + month + " 31 день");
//                        return;
//                    }
//                } else if (month == 4 || month == 6 || month == 9 || month == 11) {
//                    if (day < 30) {
//                        day++;
//                    } else if (day == 30) {
//                        day = 1;
//                        month++;
//                    }
//                    else if (day>30){
//                        System.out.println("В месяце " + month + " 30 дней");
//                        return;
//                    }
//                } else if (month == 2) {
//                    if (year % 4 != 0) {
//                        if (day < 28) {
//                            day++;
//                        } else if (day == 28) {
//                            day = 1;
//                            month++;
//                        }
//                        else if (day>28){
//                            System.out.println("В месяце 2 " + year + " года 28 дней");
//                            return;
//                        }
//                    } else {
//                        if (day < 29) {
//                            day++;
//                        } else if (day == 29) {
//                            day = 1;
//                            month++;
//                        }
//                        else if (day>29){
//                            System.out.println("В месяце 2 " + year + " года 29 дней");
//                            return;
//                        }
//                    }
//                } else if (month == 12) {
//                    if (day < 31) {
//                        day++;
//                    } else if (day == 31) {
//                        day = 1;
//                        month = 1;
//                        year++;
//                    }
//                }
//                else if (month>12){
//                    System.out.println("Месяцев 12");
//                    return;
//                }
//                System.out.println("Дата следующего дня: " + day + "/" + month + "/" + year);
    }
}
