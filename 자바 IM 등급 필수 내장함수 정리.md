### `java.util.Arrays` (배열 조작)

- `Arrays.sort(arr)` : 배열 오름차순 정렬

- `Arrays.fill(arr, value)` : 배열의 모든 요소를 특정 값으로 초기화 (2차원 배열은 반복문으로 1차원씩 초기화)

- `Arrays.copyOf(arr, length)` : 배열 복사

- `Arrays.toString(arr)` : 배열 출력 및 디버깅용

### 배열의 핵심 속성 (내장 변수)

- `arr.length` : 배열의 크기/길이 반환 (메소드가 아닌 **속성/변수**이므로 괄호 `()` 없음)

## 2. 문자열 처리 (`String` & `StringBuilder`)

IM 등급에서는 문자열을 한 글자씩 추출하거나 변환하는 문제가 자주 출제됩니다.

### `java.lang.String`

- `str.length()` : 문자열 길이 반환

- `str.charAt(index)` : 지정한 인덱스의 문자를 `char` 타입으로 반환

- `str.toCharArray()` : 문자열을 `char[]` 배열로 변환 (배열 탐색 시 유용)

- `str.substring(start, end)` : 문자열 자르기 (`start`부터 `end - 1`까지)

- `str.contains(target)` : 특정 문자열 포함 여부 (`boolean`)

- `str.indexOf(target)` : 특정 문자/문자열의 시작 위치 반환 (없으면 `-1`)

- `str.equals(otherStr)` : 문자열 값 비교 (**`==` 연산자 사용 금지**)

- `str.replace(target, replacement)` : 문자열 치환

- `str.split(regex)` : 구분자 기준으로 문자열 배열 분할

### `java.lang.StringBuilder` (문자열 조작/연산)

문자열을 자주 이어 붙이거나 뒤집어야 할 때 성능 향상을 위해 사용합니다.

- `sb.append(data)` : 뒤에 데이터 추가

- `sb.reverse()` : 문자열 뒤집기

- `sb.toString()` : `String` 객체로 변환

## 3. 수학 연산 (`java.lang.Math`)

상하좌우 거리 계산, 최소/최대값 비교, 절대값 계산 시 필수입니다.

- `Math.abs(num)` : 절대값 계산

- `Math.max(a, b)` / `Math.min(a, b)` : 두 값 중 최대/최소값 계산

- `Math.pow(base, exponent)` : 거듭제곱 ($a^b$)

- `Math.sqrt(num)` : 제곱근 계산

- `Math.round(num)` : 소수점 반올림

- `Math.ceil(num)` / `Math.floor(num)` : 올림 / 내림

### 주요 상 수 (내장 변수)

- `Integer.MAX_VALUE` : `int` 타입의 최댓값 ($2^{31}-1 \approx 21억$)

- `Integer.MIN_VALUE` : `int` 타입의 최솟값 (최소/최대값 초기화 시 활용)

## 4. 형변환 (Type Conversion)

- `Integer.parseInt(str)` : `String` $\rightarrow$ `int` 변환

- `String.valueOf(val)` 또는 `Integer.toString(num)` : 숫자 $\rightarrow$ `String` 변환

- `Character.getNumericValue(ch)` : 숫자 모양의 `char` (예: `'5'`)를 `int` (`5`)로 변환

- `Character.isDigit(ch)` : 문자가 숫자인지 확인 (`boolean`)

- `Character.isUpperCase(ch)` / `Character.isLowerCase(ch)` : 대소문자 확인
