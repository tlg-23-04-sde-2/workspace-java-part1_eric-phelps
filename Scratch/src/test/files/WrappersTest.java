package test.files;

/*
 *
 */
class WrappersTest
{
    public static void main(String[] args)
    {
        //given a string "age input"
        String ageInput = "28";
        int age = Integer.parseInt(ageInput);
        Integer ageInteger = Integer.valueOf(ageInput);

        String populationInput = "8_000_000_000";
        long population = Long.parseLong(populationInput);
        Long populationLong = Long.valueOf(populationInput);

        String salaryInput = "85_000.00";
        double salary = Double.parseDouble(salaryInput);
        Double salaryDouble = Double.valueOf(salaryInput);

        String isCloudyInput = "true";
        boolean isCloudy = Boolean.parseBoolean(isCloudyInput);
        Boolean isCloudyBool = Boolean.valueOf(isCloudyInput);

    }
}