# [1503. 所有蚂蚁掉下来前的最后一刻](https://leetcode-cn.com/problems/last-moment-before-all-ants-fall-out-of-a-plank)

[English Version](/solution/1500-1599/1503.Last%20Moment%20Before%20All%20Ants%20Fall%20Out%20of%20a%20Plank/README_EN.md)

## 题目描述

<!-- 这里写题目描述 -->

<p>有一块木板，长度为 <code>n</code> 个 <strong>单位</strong> 。一些蚂蚁在木板上移动，每只蚂蚁都以 <strong>每秒一个单位</strong> 的速度移动。其中，一部分蚂蚁向 <strong>左</strong> 移动，其他蚂蚁向 <strong>右</strong> 移动。</p>

<p>当两只向 <strong>不同</strong> 方向移动的蚂蚁在某个点相遇时，它们会同时改变移动方向并继续移动。假设更改方向不会花费任何额外时间。</p>

<p>而当蚂蚁在某一时刻 <code>t</code> 到达木板的一端时，它立即从木板上掉下来。</p>

<p>给你一个整数 <code>n</code> 和两个整数数组 <code>left</code> 以及 <code>right</code> 。两个数组分别标识向左或者向右移动的蚂蚁在 <code>t = 0</code> 时的位置。请你返回最后一只蚂蚁从木板上掉下来的时刻。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<p>&nbsp;</p>

<p><img alt="" src="https://cdn.jsdelivr.net/gh/doocs/leetcode@main/solution/1500-1599/1503.Last%20Moment%20Before%20All%20Ants%20Fall%20Out%20of%20a%20Plank/images/ants.jpg" style="height: 610px; width: 450px;"></p>

<pre><strong>输入：</strong>n = 4, left = [4,3], right = [0,1]
<strong>输出：</strong>4
<strong>解释：</strong>如上图所示：
-下标 0 处的蚂蚁命名为 A 并向右移动。
-下标 1 处的蚂蚁命名为 B 并向右移动。
-下标 3 处的蚂蚁命名为 C 并向左移动。
-下标 4 处的蚂蚁命名为 D 并向左移动。
请注意，蚂蚁在木板上的最后时刻是 t = 4 秒，之后蚂蚁立即从木板上掉下来。（也就是说在 t = 4.0000000001 时，木板上没有蚂蚁）。</pre>

<p><strong>示例 2：</strong></p>

<p><img alt="" src="https://cdn.jsdelivr.net/gh/doocs/leetcode@main/solution/1500-1599/1503.Last%20Moment%20Before%20All%20Ants%20Fall%20Out%20of%20a%20Plank/images/ants2.jpg" style="height: 101px; width: 639px;"></p>

<pre><strong>输入：</strong>n = 7, left = [], right = [0,1,2,3,4,5,6,7]
<strong>输出：</strong>7
<strong>解释：</strong>所有蚂蚁都向右移动，下标为 0 的蚂蚁需要 7 秒才能从木板上掉落。
</pre>

<p><strong>示例 3：</strong></p>

<p><img alt="" src="https://cdn.jsdelivr.net/gh/doocs/leetcode@main/solution/1500-1599/1503.Last%20Moment%20Before%20All%20Ants%20Fall%20Out%20of%20a%20Plank/images/ants3.jpg" style="height: 100px; width: 639px;"></p>

<pre><strong>输入：</strong>n = 7, left = [0,1,2,3,4,5,6,7], right = []
<strong>输出：</strong>7
<strong>解释：</strong>所有蚂蚁都向左移动，下标为 7 的蚂蚁需要 7 秒才能从木板上掉落。
</pre>

<p><strong>示例 4：</strong></p>

<pre><strong>输入：</strong>n = 9, left = [5], right = [4]
<strong>输出：</strong>5
<strong>解释：</strong>t = 1 秒时，两只蚂蚁将回到初始位置，但移动方向与之前相反。
</pre>

<p><strong>示例 5：</strong></p>

<pre><strong>输入：</strong>n = 6, left = [6], right = [0]
<strong>输出：</strong>6
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul>
	<li><code>1 &lt;= n &lt;= 10^4</code></li>
	<li><code>0 &lt;= left.length &lt;= n + 1</code></li>
	<li><code>0 &lt;= left[i] &lt;= n</code></li>
	<li><code>0 &lt;= right.length &lt;= n + 1</code></li>
	<li><code>0 &lt;= right[i] &lt;= n</code></li>
	<li><code>1 &lt;= left.length + right.length &lt;= n + 1</code></li>
	<li><code>left</code> 和 <code>right</code> 中的所有值都是唯一的，并且每个值 <strong>只能出现在二者之一</strong> 中。</li>
</ul>


## 解法

<!-- 这里可写通用的实现逻辑 -->

<!-- tabs:start -->

### **Python3**

<!-- 这里可写当前语言的特殊实现逻辑 -->

```python

```

### **Java**

<!-- 这里可写当前语言的特殊实现逻辑 -->

```java

```

### **...**

```

```

<!-- tabs:end -->