// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineFilterArgs Empty = new PipelineFilterArgs();

    @InputImport(name="filter", required=true)
        private final Input<String> filter;

    public Input<String> getFilter() {
        return this.filter;
    }

    @InputImport(name="name", required=true)
        private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="next")
        private final @Nullable Input<String> next;

    public Input<String> getNext() {
        return this.next == null ? Input.empty() : this.next;
    }

    public PipelineFilterArgs(
        Input<String> filter,
        Input<String> name,
        @Nullable Input<String> next) {
        this.filter = Objects.requireNonNull(filter, "expected parameter 'filter' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.next = next;
    }

    private PipelineFilterArgs() {
        this.filter = Input.empty();
        this.name = Input.empty();
        this.next = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> filter;
        private Input<String> name;
        private @Nullable Input<String> next;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.name = defaults.name;
    	      this.next = defaults.next;
        }

        public Builder setFilter(Input<String> filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder setFilter(String filter) {
            this.filter = Input.of(Objects.requireNonNull(filter));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setNext(@Nullable Input<String> next) {
            this.next = next;
            return this;
        }

        public Builder setNext(@Nullable String next) {
            this.next = Input.ofNullable(next);
            return this;
        }
        public PipelineFilterArgs build() {
            return new PipelineFilterArgs(filter, name, next);
        }
    }
}
