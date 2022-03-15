// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelineSelectAttributes extends io.pulumi.resources.InvokeArgs {

    public static final PipelineSelectAttributes Empty = new PipelineSelectAttributes();

    @Import(name="attributes", required=true)
      private final List<String> attributes;

    public List<String> getAttributes() {
        return this.attributes;
    }

    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    @Import(name="next")
      private final @Nullable String next;

    public Optional<String> getNext() {
        return this.next == null ? Optional.empty() : Optional.ofNullable(this.next);
    }

    public PipelineSelectAttributes(
        List<String> attributes,
        String name,
        @Nullable String next) {
        this.attributes = Objects.requireNonNull(attributes, "expected parameter 'attributes' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.next = next;
    }

    private PipelineSelectAttributes() {
        this.attributes = List.of();
        this.name = null;
        this.next = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineSelectAttributes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> attributes;
        private String name;
        private @Nullable String next;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineSelectAttributes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.name = defaults.name;
    	      this.next = defaults.next;
        }

        public Builder attributes(List<String> attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder next(@Nullable String next) {
            this.next = next;
            return this;
        }
        public PipelineSelectAttributes build() {
            return new PipelineSelectAttributes(attributes, name, next);
        }
    }
}
