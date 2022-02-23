// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Additional information on the backed up item.
 * 
 */
public final class MabFileFolderProtectedItemExtendedInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final MabFileFolderProtectedItemExtendedInfoArgs Empty = new MabFileFolderProtectedItemExtendedInfoArgs();

    /**
     * Last time when the agent data synced to service.
     * 
     */
    @InputImport(name="lastRefreshedAt")
        private final @Nullable Input<String> lastRefreshedAt;

    public Input<String> getLastRefreshedAt() {
        return this.lastRefreshedAt == null ? Input.empty() : this.lastRefreshedAt;
    }

    /**
     * The oldest backup copy available.
     * 
     */
    @InputImport(name="oldestRecoveryPoint")
        private final @Nullable Input<String> oldestRecoveryPoint;

    public Input<String> getOldestRecoveryPoint() {
        return this.oldestRecoveryPoint == null ? Input.empty() : this.oldestRecoveryPoint;
    }

    /**
     * Number of backup copies associated with the backup item.
     * 
     */
    @InputImport(name="recoveryPointCount")
        private final @Nullable Input<Integer> recoveryPointCount;

    public Input<Integer> getRecoveryPointCount() {
        return this.recoveryPointCount == null ? Input.empty() : this.recoveryPointCount;
    }

    public MabFileFolderProtectedItemExtendedInfoArgs(
        @Nullable Input<String> lastRefreshedAt,
        @Nullable Input<String> oldestRecoveryPoint,
        @Nullable Input<Integer> recoveryPointCount) {
        this.lastRefreshedAt = lastRefreshedAt;
        this.oldestRecoveryPoint = oldestRecoveryPoint;
        this.recoveryPointCount = recoveryPointCount;
    }

    private MabFileFolderProtectedItemExtendedInfoArgs() {
        this.lastRefreshedAt = Input.empty();
        this.oldestRecoveryPoint = Input.empty();
        this.recoveryPointCount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MabFileFolderProtectedItemExtendedInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> lastRefreshedAt;
        private @Nullable Input<String> oldestRecoveryPoint;
        private @Nullable Input<Integer> recoveryPointCount;

        public Builder() {
    	      // Empty
        }

        public Builder(MabFileFolderProtectedItemExtendedInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastRefreshedAt = defaults.lastRefreshedAt;
    	      this.oldestRecoveryPoint = defaults.oldestRecoveryPoint;
    	      this.recoveryPointCount = defaults.recoveryPointCount;
        }

        public Builder setLastRefreshedAt(@Nullable Input<String> lastRefreshedAt) {
            this.lastRefreshedAt = lastRefreshedAt;
            return this;
        }

        public Builder setLastRefreshedAt(@Nullable String lastRefreshedAt) {
            this.lastRefreshedAt = Input.ofNullable(lastRefreshedAt);
            return this;
        }

        public Builder setOldestRecoveryPoint(@Nullable Input<String> oldestRecoveryPoint) {
            this.oldestRecoveryPoint = oldestRecoveryPoint;
            return this;
        }

        public Builder setOldestRecoveryPoint(@Nullable String oldestRecoveryPoint) {
            this.oldestRecoveryPoint = Input.ofNullable(oldestRecoveryPoint);
            return this;
        }

        public Builder setRecoveryPointCount(@Nullable Input<Integer> recoveryPointCount) {
            this.recoveryPointCount = recoveryPointCount;
            return this;
        }

        public Builder setRecoveryPointCount(@Nullable Integer recoveryPointCount) {
            this.recoveryPointCount = Input.ofNullable(recoveryPointCount);
            return this;
        }
        public MabFileFolderProtectedItemExtendedInfoArgs build() {
            return new MabFileFolderProtectedItemExtendedInfoArgs(lastRefreshedAt, oldestRecoveryPoint, recoveryPointCount);
        }
    }
}
