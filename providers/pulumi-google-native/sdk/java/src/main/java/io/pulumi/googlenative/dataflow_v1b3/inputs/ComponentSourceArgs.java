// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Description of an interstitial value between transforms in an execution stage.
 * 
 */
public final class ComponentSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ComponentSourceArgs Empty = new ComponentSourceArgs();

    /**
     * Dataflow service generated name for this source.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * User name for the original user transform or collection with which this source is most closely associated.
     * 
     */
    @Import(name="originalTransformOrCollection")
      private final @Nullable Output<String> originalTransformOrCollection;

    public Output<String> getOriginalTransformOrCollection() {
        return this.originalTransformOrCollection == null ? Output.empty() : this.originalTransformOrCollection;
    }

    /**
     * Human-readable name for this transform; may be user or system generated.
     * 
     */
    @Import(name="userName")
      private final @Nullable Output<String> userName;

    public Output<String> getUserName() {
        return this.userName == null ? Output.empty() : this.userName;
    }

    public ComponentSourceArgs(
        @Nullable Output<String> name,
        @Nullable Output<String> originalTransformOrCollection,
        @Nullable Output<String> userName) {
        this.name = name;
        this.originalTransformOrCollection = originalTransformOrCollection;
        this.userName = userName;
    }

    private ComponentSourceArgs() {
        this.name = Output.empty();
        this.originalTransformOrCollection = Output.empty();
        this.userName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> originalTransformOrCollection;
        private @Nullable Output<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.originalTransformOrCollection = defaults.originalTransformOrCollection;
    	      this.userName = defaults.userName;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder originalTransformOrCollection(@Nullable Output<String> originalTransformOrCollection) {
            this.originalTransformOrCollection = originalTransformOrCollection;
            return this;
        }

        public Builder originalTransformOrCollection(@Nullable String originalTransformOrCollection) {
            this.originalTransformOrCollection = Output.ofNullable(originalTransformOrCollection);
            return this;
        }

        public Builder userName(@Nullable Output<String> userName) {
            this.userName = userName;
            return this;
        }

        public Builder userName(@Nullable String userName) {
            this.userName = Output.ofNullable(userName);
            return this;
        }
        public ComponentSourceArgs build() {
            return new ComponentSourceArgs(name, originalTransformOrCollection, userName);
        }
    }
}
