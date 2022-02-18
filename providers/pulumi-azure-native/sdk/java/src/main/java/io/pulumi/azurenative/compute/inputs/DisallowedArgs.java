// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the disallowed disk types.
 * 
 */
public final class DisallowedArgs extends io.pulumi.resources.ResourceArgs {

    public static final DisallowedArgs Empty = new DisallowedArgs();

    /**
     * A list of disk types.
     * 
     */
    @InputImport(name="diskTypes")
    private final @Nullable Input<List<String>> diskTypes;

    public Input<List<String>> getDiskTypes() {
        return this.diskTypes == null ? Input.empty() : this.diskTypes;
    }

    public DisallowedArgs(@Nullable Input<List<String>> diskTypes) {
        this.diskTypes = diskTypes;
    }

    private DisallowedArgs() {
        this.diskTypes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DisallowedArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> diskTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(DisallowedArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskTypes = defaults.diskTypes;
        }

        public Builder setDiskTypes(@Nullable Input<List<String>> diskTypes) {
            this.diskTypes = diskTypes;
            return this;
        }

        public Builder setDiskTypes(@Nullable List<String> diskTypes) {
            this.diskTypes = Input.ofNullable(diskTypes);
            return this;
        }

        public DisallowedArgs build() {
            return new DisallowedArgs(diskTypes);
        }
    }
}
