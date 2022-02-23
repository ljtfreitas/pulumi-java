// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BackupVaultLockConfigurationType {
    private final @Nullable Double changeableForDays;
    private final @Nullable Double maxRetentionDays;
    private final Double minRetentionDays;

    @OutputCustomType.Constructor({"changeableForDays","maxRetentionDays","minRetentionDays"})
    private BackupVaultLockConfigurationType(
        @Nullable Double changeableForDays,
        @Nullable Double maxRetentionDays,
        Double minRetentionDays) {
        this.changeableForDays = changeableForDays;
        this.maxRetentionDays = maxRetentionDays;
        this.minRetentionDays = Objects.requireNonNull(minRetentionDays);
    }

    public Optional<Double> getChangeableForDays() {
        return Optional.ofNullable(this.changeableForDays);
    }
    public Optional<Double> getMaxRetentionDays() {
        return Optional.ofNullable(this.maxRetentionDays);
    }
    public Double getMinRetentionDays() {
        return this.minRetentionDays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupVaultLockConfigurationType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double changeableForDays;
        private @Nullable Double maxRetentionDays;
        private Double minRetentionDays;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupVaultLockConfigurationType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.changeableForDays = defaults.changeableForDays;
    	      this.maxRetentionDays = defaults.maxRetentionDays;
    	      this.minRetentionDays = defaults.minRetentionDays;
        }

        public Builder setChangeableForDays(@Nullable Double changeableForDays) {
            this.changeableForDays = changeableForDays;
            return this;
        }

        public Builder setMaxRetentionDays(@Nullable Double maxRetentionDays) {
            this.maxRetentionDays = maxRetentionDays;
            return this;
        }

        public Builder setMinRetentionDays(Double minRetentionDays) {
            this.minRetentionDays = Objects.requireNonNull(minRetentionDays);
            return this;
        }
        public BackupVaultLockConfigurationType build() {
            return new BackupVaultLockConfigurationType(changeableForDays, maxRetentionDays, minRetentionDays);
        }
    }
}
