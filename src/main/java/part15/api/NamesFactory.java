package part15.api;

public class NamesFactory {

    private String [] names = {"Noah", "Liam", "Mason", "Jacob", "William", "Ethan", "Michael", "Alexander",
            "James", "Daniel", "Elijah", "Benjamin", "Logan", "Aiden", "Jayden", "Matthew", "Jackson",
            "David", "Lucas", "Joseph", "Anthony", "Andrew", "Samuel", "Gabriel", "Joshua", "Emma",
            "Olivia", "Sophia", "Isabella", "Ava", "Mia", "Emily", "Abigail", "Madison", "Charlotte",
            "Harper", "Sofia", "Avery", "Elizabeth", "Amelia", "Evelyn", "Ella", "Chloe", "Victoria",
            "Aubrey", "Grace", "Zoey", "Natalie", "Addison", "Lillian"};

    private String [] surNames = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson",
            "Moore", "Taylor", "Anderson", "Thomas", "Jackson", "White", "Harris", "Martin", "Thompson",
            "Garcia", "Martinez", "Robinson", "Clark", "Rodriguez", "Lewis", "Lee", "Walker", "Hall",
            "Allen", "Young", "Hernandez", "King", "Wright", "Lopez", "Hill", "Scott", "Green", "Adams",
            "Baker", "Nelson", "Carter", "Mitchell", "Perez", "Roberts", "Turner", "Phillips", "Campbell",
            "Parker", "Evans", "Edwards", "Collins", "Stewart", "Sanchez", "Morris", "Rogers", "Reed",
            "Cook", "Morgan", "Bell", "Murphy", "Bailey", "Rivera", "Cooper", "Cox", "Howard", "Ward",
            "Torres", "Peterson", "Gray", "Ramirez", "James", "Watson", "Brooks", "Kelly", "Sanders",
            "Price", "Bennett", "Wood", "Barnes", "Ross", "Henderson", "Coleman", "Jenkins", "Perry",
            "Powell", "Long", "Patterson", "Hughes", "Flores", "Washington", "Butler", "Simmons",
            "Foster", "Gonzales", "Bryant", "Alexander", "Russell", "Griffin", "Diaz", "Hayes"};

    public String getRandomName () {
        return names[(int) (Math.random()* names.length)];
    }

    public String getRandomSurName () {
        return surNames[(int) (Math.random()* names.length)];
    }
}
