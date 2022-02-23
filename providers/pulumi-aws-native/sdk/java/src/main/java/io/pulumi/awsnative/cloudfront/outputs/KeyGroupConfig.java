// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class KeyGroupConfig {
    private final @Nullable String comment;
    private final List<String> items;
    private final String name;

    @OutputCustomType.Constructor({"comment","items","name"})
    private KeyGroupConfig(
        @Nullable String comment,
        List<String> items,
        String name) {
        this.comment = comment;
        this.items = Objects.requireNonNull(items);
        this.name = Objects.requireNonNull(name);
    }

    public Optional<String> getComment() {
        return Optional.ofNullable(this.comment);
    }
    public List<String> getItems() {
        return this.items;
    }
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyGroupConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String comment;
        private List<String> items;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyGroupConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.items = defaults.items;
    	      this.name = defaults.name;
        }

        public Builder setComment(@Nullable String comment) {
            this.comment = comment;
            return this;
        }

        public Builder setItems(List<String> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public KeyGroupConfig build() {
            return new KeyGroupConfig(comment, items, name);
        }
    }
}
