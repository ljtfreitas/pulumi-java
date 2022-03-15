// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="lastRefreshedAt")
      private final @Nullable Output<String> lastRefreshedAt;

    public Output<String> getLastRefreshedAt() {
        return this.lastRefreshedAt == null ? Output.empty() : this.lastRefreshedAt;
    }

    /**
     * The oldest backup copy available.
     * 
     */
    @Import(name="oldestRecoveryPoint")
      private final @Nullable Output<String> oldestRecoveryPoint;

    public Output<String> getOldestRecoveryPoint() {
        return this.oldestRecoveryPoint == null ? Output.empty() : this.oldestRecoveryPoint;
    }

    /**
     * Number of backup copies associated with the backup item.
     * 
     */
    @Import(name="recoveryPointCount")
      private final @Nullable Output<Integer> recoveryPointCount;

    public Output<Integer> getRecoveryPointCount() {
        return this.recoveryPointCount == null ? Output.empty() : this.recoveryPointCount;
    }

    public MabFileFolderProtectedItemExtendedInfoArgs(
        @Nullable Output<String> lastRefreshedAt,
        @Nullable Output<String> oldestRecoveryPoint,
        @Nullable Output<Integer> recoveryPointCount) {
        this.lastRefreshedAt = lastRefreshedAt;
        this.oldestRecoveryPoint = oldestRecoveryPoint;
        this.recoveryPointCount = recoveryPointCount;
    }

    private MabFileFolderProtectedItemExtendedInfoArgs() {
        this.lastRefreshedAt = Output.empty();
        this.oldestRecoveryPoint = Output.empty();
        this.recoveryPointCount = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MabFileFolderProtectedItemExtendedInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> lastRefreshedAt;
        private @Nullable Output<String> oldestRecoveryPoint;
        private @Nullable Output<Integer> recoveryPointCount;

        public Builder() {
    	      // Empty
        }

        public Builder(MabFileFolderProtectedItemExtendedInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastRefreshedAt = defaults.lastRefreshedAt;
    	      this.oldestRecoveryPoint = defaults.oldestRecoveryPoint;
    	      this.recoveryPointCount = defaults.recoveryPointCount;
        }

        public Builder lastRefreshedAt(@Nullable Output<String> lastRefreshedAt) {
            this.lastRefreshedAt = lastRefreshedAt;
            return this;
        }

        public Builder lastRefreshedAt(@Nullable String lastRefreshedAt) {
            this.lastRefreshedAt = Output.ofNullable(lastRefreshedAt);
            return this;
        }

        public Builder oldestRecoveryPoint(@Nullable Output<String> oldestRecoveryPoint) {
            this.oldestRecoveryPoint = oldestRecoveryPoint;
            return this;
        }

        public Builder oldestRecoveryPoint(@Nullable String oldestRecoveryPoint) {
            this.oldestRecoveryPoint = Output.ofNullable(oldestRecoveryPoint);
            return this;
        }

        public Builder recoveryPointCount(@Nullable Output<Integer> recoveryPointCount) {
            this.recoveryPointCount = recoveryPointCount;
            return this;
        }

        public Builder recoveryPointCount(@Nullable Integer recoveryPointCount) {
            this.recoveryPointCount = Output.ofNullable(recoveryPointCount);
            return this;
        }
        public MabFileFolderProtectedItemExtendedInfoArgs build() {
            return new MabFileFolderProtectedItemExtendedInfoArgs(lastRefreshedAt, oldestRecoveryPoint, recoveryPointCount);
        }
    }
}
