// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The folder that this Pipeline is in. If not specified, Pipeline will appear at the root level.
 * 
 */
public final class PipelineFolderArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineFolderArgs Empty = new PipelineFolderArgs();

    /**
     * The name of the folder that this Pipeline is in.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public PipelineFolderArgs(@Nullable Input<String> name) {
        this.name = name;
    }

    private PipelineFolderArgs() {
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineFolderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineFolderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public PipelineFolderArgs build() {
            return new PipelineFolderArgs(name);
        }
    }
}
