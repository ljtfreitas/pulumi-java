// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomDataIdentifierArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomDataIdentifierArgs Empty = new CustomDataIdentifierArgs();

    /**
     * A custom description of the custom data identifier. The description can contain as many as 512 characters.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * An array that lists specific character sequences (ignore words) to exclude from the results. If the text matched by the regular expression is the same as any string in this array, Amazon Macie ignores it. The array can contain as many as 10 ignore words. Each ignore word can contain 4 - 90 characters. Ignore words are case sensitive.
     * 
     */
    @InputImport(name="ignoreWords")
    private final @Nullable Input<List<String>> ignoreWords;

    public Input<List<String>> getIgnoreWords() {
        return this.ignoreWords == null ? Input.empty() : this.ignoreWords;
    }

    /**
     * An array that lists specific character sequences (keywords), one of which must be within proximity (`maximum_match_distance`) of the regular expression to match. The array can contain as many as 50 keywords. Each keyword can contain 3 - 90 characters. Keywords aren't case sensitive.
     * 
     */
    @InputImport(name="keywords")
    private final @Nullable Input<List<String>> keywords;

    public Input<List<String>> getKeywords() {
        return this.keywords == null ? Input.empty() : this.keywords;
    }

    /**
     * The maximum number of characters that can exist between text that matches the regex pattern and the character sequences specified by the keywords array. Macie includes or excludes a result based on the proximity of a keyword to text that matches the regex pattern. The distance can be 1 - 300 characters. The default value is 50.
     * 
     */
    @InputImport(name="maximumMatchDistance")
    private final @Nullable Input<Integer> maximumMatchDistance;

    public Input<Integer> getMaximumMatchDistance() {
        return this.maximumMatchDistance == null ? Input.empty() : this.maximumMatchDistance;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @InputImport(name="namePrefix")
    private final @Nullable Input<String> namePrefix;

    public Input<String> getNamePrefix() {
        return this.namePrefix == null ? Input.empty() : this.namePrefix;
    }

    /**
     * The regular expression (regex) that defines the pattern to match. The expression can contain as many as 512 characters.
     * 
     */
    @InputImport(name="regex")
    private final @Nullable Input<String> regex;

    public Input<String> getRegex() {
        return this.regex == null ? Input.empty() : this.regex;
    }

    /**
     * A map of key-value pairs that specifies the tags to associate with the custom data identifier.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public CustomDataIdentifierArgs(
        @Nullable Input<String> description,
        @Nullable Input<List<String>> ignoreWords,
        @Nullable Input<List<String>> keywords,
        @Nullable Input<Integer> maximumMatchDistance,
        @Nullable Input<String> name,
        @Nullable Input<String> namePrefix,
        @Nullable Input<String> regex,
        @Nullable Input<Map<String,String>> tags) {
        this.description = description;
        this.ignoreWords = ignoreWords;
        this.keywords = keywords;
        this.maximumMatchDistance = maximumMatchDistance;
        this.name = name;
        this.namePrefix = namePrefix;
        this.regex = regex;
        this.tags = tags;
    }

    private CustomDataIdentifierArgs() {
        this.description = Input.empty();
        this.ignoreWords = Input.empty();
        this.keywords = Input.empty();
        this.maximumMatchDistance = Input.empty();
        this.name = Input.empty();
        this.namePrefix = Input.empty();
        this.regex = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomDataIdentifierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<List<String>> ignoreWords;
        private @Nullable Input<List<String>> keywords;
        private @Nullable Input<Integer> maximumMatchDistance;
        private @Nullable Input<String> name;
        private @Nullable Input<String> namePrefix;
        private @Nullable Input<String> regex;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomDataIdentifierArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.ignoreWords = defaults.ignoreWords;
    	      this.keywords = defaults.keywords;
    	      this.maximumMatchDistance = defaults.maximumMatchDistance;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.regex = defaults.regex;
    	      this.tags = defaults.tags;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setIgnoreWords(@Nullable Input<List<String>> ignoreWords) {
            this.ignoreWords = ignoreWords;
            return this;
        }

        public Builder setIgnoreWords(@Nullable List<String> ignoreWords) {
            this.ignoreWords = Input.ofNullable(ignoreWords);
            return this;
        }

        public Builder setKeywords(@Nullable Input<List<String>> keywords) {
            this.keywords = keywords;
            return this;
        }

        public Builder setKeywords(@Nullable List<String> keywords) {
            this.keywords = Input.ofNullable(keywords);
            return this;
        }

        public Builder setMaximumMatchDistance(@Nullable Input<Integer> maximumMatchDistance) {
            this.maximumMatchDistance = maximumMatchDistance;
            return this;
        }

        public Builder setMaximumMatchDistance(@Nullable Integer maximumMatchDistance) {
            this.maximumMatchDistance = Input.ofNullable(maximumMatchDistance);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNamePrefix(@Nullable Input<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        public Builder setNamePrefix(@Nullable String namePrefix) {
            this.namePrefix = Input.ofNullable(namePrefix);
            return this;
        }

        public Builder setRegex(@Nullable Input<String> regex) {
            this.regex = regex;
            return this;
        }

        public Builder setRegex(@Nullable String regex) {
            this.regex = Input.ofNullable(regex);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public CustomDataIdentifierArgs build() {
            return new CustomDataIdentifierArgs(description, ignoreWords, keywords, maximumMatchDistance, name, namePrefix, regex, tags);
        }
    }
}
