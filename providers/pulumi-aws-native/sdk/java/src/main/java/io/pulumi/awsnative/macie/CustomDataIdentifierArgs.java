// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.macie;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomDataIdentifierArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomDataIdentifierArgs Empty = new CustomDataIdentifierArgs();

    /**
     * Description of custom data identifier.
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Words to be ignored.
     * 
     */
    @InputImport(name="ignoreWords")
        private final @Nullable Input<List<String>> ignoreWords;

    public Input<List<String>> getIgnoreWords() {
        return this.ignoreWords == null ? Input.empty() : this.ignoreWords;
    }

    /**
     * Keywords to be matched against.
     * 
     */
    @InputImport(name="keywords")
        private final @Nullable Input<List<String>> keywords;

    public Input<List<String>> getKeywords() {
        return this.keywords == null ? Input.empty() : this.keywords;
    }

    /**
     * Maximum match distance.
     * 
     */
    @InputImport(name="maximumMatchDistance")
        private final @Nullable Input<Integer> maximumMatchDistance;

    public Input<Integer> getMaximumMatchDistance() {
        return this.maximumMatchDistance == null ? Input.empty() : this.maximumMatchDistance;
    }

    /**
     * Name of custom data identifier.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Regular expression for custom data identifier.
     * 
     */
    @InputImport(name="regex", required=true)
        private final Input<String> regex;

    public Input<String> getRegex() {
        return this.regex;
    }

    public CustomDataIdentifierArgs(
        @Nullable Input<String> description,
        @Nullable Input<List<String>> ignoreWords,
        @Nullable Input<List<String>> keywords,
        @Nullable Input<Integer> maximumMatchDistance,
        @Nullable Input<String> name,
        Input<String> regex) {
        this.description = description;
        this.ignoreWords = ignoreWords;
        this.keywords = keywords;
        this.maximumMatchDistance = maximumMatchDistance;
        this.name = name;
        this.regex = Objects.requireNonNull(regex, "expected parameter 'regex' to be non-null");
    }

    private CustomDataIdentifierArgs() {
        this.description = Input.empty();
        this.ignoreWords = Input.empty();
        this.keywords = Input.empty();
        this.maximumMatchDistance = Input.empty();
        this.name = Input.empty();
        this.regex = Input.empty();
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
        private Input<String> regex;

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
    	      this.regex = defaults.regex;
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

        public Builder setRegex(Input<String> regex) {
            this.regex = Objects.requireNonNull(regex);
            return this;
        }

        public Builder setRegex(String regex) {
            this.regex = Input.of(Objects.requireNonNull(regex));
            return this;
        }
        public CustomDataIdentifierArgs build() {
            return new CustomDataIdentifierArgs(description, ignoreWords, keywords, maximumMatchDistance, name, regex);
        }
    }
}
