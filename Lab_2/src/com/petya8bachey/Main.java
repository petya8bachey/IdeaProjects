package com.petya8bachey;

import java.io.*;
import java.util.*;

@SuppressWarnings("ALL")
public class Main {
    public static void main(String[] args) {
        Task_7();
    }

    static void Task_1() {
        try {
            // Создаем стек
            Stack<String> readStack = new Stack<String>();
            // Считываем посимвольно файл
            FileReader reader = new FileReader("src/com/petya8bachey/lines.txt");
            String str = "";
            int chr;
            while (reader.ready()) {
                chr = reader.read();
                str += (char) chr;
                if (chr == 13) { // 13 код символа перехода на следующую строку
                    readStack.push(str);
                    str = "";
                }
            }
            // Записываем построчно в файл
            reader.close();
            FileWriter writer = new FileWriter("src/com/petya8bachey/lines.txt", true);
            while (!readStack.isEmpty()) {
                str = readStack.pop();
                writer.write(str);
            }
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static void Task_2() {
        try {
            Stack<Character> characterStack = new Stack<Character>();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String number = reader.readLine();
            for (int i = 0; i < number.length(); i++) {
                characterStack.push(number.charAt(i));
            }
            while (!characterStack.isEmpty()) {
                System.out.print(characterStack.pop());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static void Task_3() {
        HashMap<Integer, Integer> ratioMap_1 = new HashMap<Integer, Integer>();
        ratioMap_1.put(0, 10);
        ratioMap_1.put(1, 0);
        ratioMap_1.put(2, 1);
        HashMap<Integer, Integer> ratioMap_2 = new HashMap<Integer, Integer>();
        ratioMap_2.put(0, 5);
        ratioMap_2.put(1, 7);
        ratioMap_2.put(2, 2);
        HashMap<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> entry : ratioMap_1.entrySet()) {
            resultMap.put(entry.getKey(), entry.getValue() + ratioMap_2.get(entry.getKey()));
        }
        for (Map.Entry<Integer, Integer> entry : resultMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    static void Task_4() {
    }

    static void Task_5() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(-1);
        list.add(1);
        list.add(-1);
        list.add(1);
        list.add(-1);
        list.add(1);
        list.add(-1);
        list.add(1);
        list.add(-1);
        list.add(1);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.add(list.get(i));
                list.remove(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    static void Task_6() {
    }

    static void Task_7() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> listCopy = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(3);
        for (int j = 0; j < list.size(); j++) {

            for (int i = 0; i < list.size(); i += 2) {
                listCopy.add(list.get(i) + (i++ > list.size() ? 0:i++));
            }
        }
        System.out.println(listCopy.get(0));
    }

    static void Task_8() {
    }

    static void Task_9() {
    }

    static void Task_10() {
    }

    static void Task_11() {
    }

    static void Task_12() {
    }

    static void Task_13() {
    }
}