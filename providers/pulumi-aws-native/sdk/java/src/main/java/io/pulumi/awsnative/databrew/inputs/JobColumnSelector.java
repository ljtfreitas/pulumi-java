// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobColumnSelector extends io.pulumi.resources.InvokeArgs {

    public static final JobColumnSelector Empty = new JobColumnSelector();

    @InputImport(name="name")
        private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    @InputImport(name="regex")
        private final @Nullable String regex;

    public Optional<String> getRegex() {
        return this.regex == null ? Optional.empty() : Optional.ofNullable(this.regex);
    }

    public JobColumnSelector(
        @Nullable String name,
        @Nullable String regex) {
        this.name = name;
        this.regex = regex;
    }

    private JobColumnSelector() {
        this.name = null;
        this.regex = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobColumnSelector defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String regex;

        public Builder() {
    	      // Empty
        }

        public Builder(JobColumnSelector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.regex = defaults.regex;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setRegex(@Nullable String regex) {
            this.regex = regex;
            return this;
        }
        public JobColumnSelector build() {
            return new JobColumnSelector(name, regex);
        }
    }
}
