// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.extensions_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.extensions_v1beta1.outputs.RollingUpdateDaemonSet;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DaemonSetUpdateStrategy {
    /**
     * Rolling update config params. Present only if type = "RollingUpdate".
     * 
     */
    private final @Nullable RollingUpdateDaemonSet rollingUpdate;
    /**
     * Type of daemon set update. Can be "RollingUpdate" or "OnDelete". Default is OnDelete.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor({"rollingUpdate","type"})
    private DaemonSetUpdateStrategy(
        @Nullable RollingUpdateDaemonSet rollingUpdate,
        @Nullable String type) {
        this.rollingUpdate = rollingUpdate;
        this.type = type;
    }

    /**
     * Rolling update config params. Present only if type = "RollingUpdate".
     * 
     */
    public Optional<RollingUpdateDaemonSet> getRollingUpdate() {
        return Optional.ofNullable(this.rollingUpdate);
    }
    /**
     * Type of daemon set update. Can be "RollingUpdate" or "OnDelete". Default is OnDelete.
     * 
     */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DaemonSetUpdateStrategy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RollingUpdateDaemonSet rollingUpdate;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DaemonSetUpdateStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rollingUpdate = defaults.rollingUpdate;
    	      this.type = defaults.type;
        }

        public Builder setRollingUpdate(@Nullable RollingUpdateDaemonSet rollingUpdate) {
            this.rollingUpdate = rollingUpdate;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public DaemonSetUpdateStrategy build() {
            return new DaemonSetUpdateStrategy(rollingUpdate, type);
        }
    }
}
