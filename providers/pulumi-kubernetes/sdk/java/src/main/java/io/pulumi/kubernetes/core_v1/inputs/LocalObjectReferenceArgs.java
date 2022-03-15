// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * LocalObjectReference contains enough information to let you locate the referenced object inside the same namespace.
 * 
 */
public final class LocalObjectReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocalObjectReferenceArgs Empty = new LocalObjectReferenceArgs();

    /**
     * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public LocalObjectReferenceArgs(@Nullable Output<String> name) {
        this.name = name;
    }

    private LocalObjectReferenceArgs() {
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocalObjectReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(LocalObjectReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public LocalObjectReferenceArgs build() {
            return new LocalObjectReferenceArgs(name);
        }
    }
}
