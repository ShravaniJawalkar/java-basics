package org.example.generic;

public enum Child implements Base {
    CHILD1("Child 1", 1) {
        @Override
        public void operate() {
            // Implementation for CHILD3
            System.out.println("Operating CHILD1");
        }

        public String getDescription() {
            return "This is a special child: ";
        }
    },
    CHILD2("Child 2", 2) {
        @Override
        public void operate() {
            // Implementation for CHILD3
            System.out.println("Operating CHILD2");
        }
    },
    CHILD3("Child 3", 3) {
        @Override
        public void operate() {
            // Implementation for CHILD3
            System.out.println("Operating CHILD3");
        }
    };

    private final String name;
    private final int age; // Example of a field that could be used in the enum

    Child(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public abstract void operate();

    public static Child fromName(String name) {
        for (Child child : Child.values()) {
            if (child.getName().equalsIgnoreCase(name)) {
                return child;
            }
        }
        throw new IllegalArgumentException("No enum constant with name: " + name);
    }

    public String getDescription() {
        return "This is a default child: ";
    }
}
