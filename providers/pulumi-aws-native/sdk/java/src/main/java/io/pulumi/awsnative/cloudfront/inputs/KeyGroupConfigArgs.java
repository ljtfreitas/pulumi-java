// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KeyGroupConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyGroupConfigArgs Empty = new KeyGroupConfigArgs();

    @Import(name="comment")
      private final @Nullable Output<String> comment;

    public Output<String> getComment() {
        return this.comment == null ? Output.empty() : this.comment;
    }

    @Import(name="items", required=true)
      private final Output<List<String>> items;

    public Output<List<String>> getItems() {
        return this.items;
    }

    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public KeyGroupConfigArgs(
        @Nullable Output<String> comment,
        Output<List<String>> items,
        Output<String> name) {
        this.comment = comment;
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private KeyGroupConfigArgs() {
        this.comment = Output.empty();
        this.items = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyGroupConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> comment;
        private Output<List<String>> items;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyGroupConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.items = defaults.items;
    	      this.name = defaults.name;
        }

        public Builder comment(@Nullable Output<String> comment) {
            this.comment = comment;
            return this;
        }

        public Builder comment(@Nullable String comment) {
            this.comment = Output.ofNullable(comment);
            return this;
        }

        public Builder items(Output<List<String>> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }

        public Builder items(List<String> items) {
            this.items = Output.of(Objects.requireNonNull(items));
            return this;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public KeyGroupConfigArgs build() {
            return new KeyGroupConfigArgs(comment, items, name);
        }
    }
}
