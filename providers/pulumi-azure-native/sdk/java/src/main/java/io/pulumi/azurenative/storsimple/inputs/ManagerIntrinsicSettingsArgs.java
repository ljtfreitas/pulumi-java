// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.inputs;

import io.pulumi.azurenative.storsimple.enums.ManagerType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * Intrinsic settings which refers to the type of the StorSimple Manager.
 * 
 */
public final class ManagerIntrinsicSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagerIntrinsicSettingsArgs Empty = new ManagerIntrinsicSettingsArgs();

    /**
     * The type of StorSimple Manager.
     * 
     */
    @Import(name="type", required=true)
      private final Output<ManagerType> type;

    public Output<ManagerType> getType() {
        return this.type;
    }

    public ManagerIntrinsicSettingsArgs(Output<ManagerType> type) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ManagerIntrinsicSettingsArgs() {
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagerIntrinsicSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ManagerType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagerIntrinsicSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(Output<ManagerType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(ManagerType type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public ManagerIntrinsicSettingsArgs build() {
            return new ManagerIntrinsicSettingsArgs(type);
        }
    }
}
