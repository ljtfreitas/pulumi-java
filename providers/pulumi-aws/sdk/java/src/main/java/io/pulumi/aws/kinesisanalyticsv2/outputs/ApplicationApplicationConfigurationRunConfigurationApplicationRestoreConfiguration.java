// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfiguration {
    /**
     * Specifies how the application should be restored. Valid values: `RESTORE_FROM_CUSTOM_SNAPSHOT`, `RESTORE_FROM_LATEST_SNAPSHOT`, `SKIP_RESTORE_FROM_SNAPSHOT`.
     * 
     */
    private final @Nullable String applicationRestoreType;
    /**
     * The identifier of an existing snapshot of application state to use to restart an application. The application uses this value if `RESTORE_FROM_CUSTOM_SNAPSHOT` is specified for `application_restore_type`.
     * 
     */
    private final @Nullable String snapshotName;

    @CustomType.Constructor
    private ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfiguration(
        @CustomType.Parameter("applicationRestoreType") @Nullable String applicationRestoreType,
        @CustomType.Parameter("snapshotName") @Nullable String snapshotName) {
        this.applicationRestoreType = applicationRestoreType;
        this.snapshotName = snapshotName;
    }

    /**
     * Specifies how the application should be restored. Valid values: `RESTORE_FROM_CUSTOM_SNAPSHOT`, `RESTORE_FROM_LATEST_SNAPSHOT`, `SKIP_RESTORE_FROM_SNAPSHOT`.
     * 
    */
    public Optional<String> getApplicationRestoreType() {
        return Optional.ofNullable(this.applicationRestoreType);
    }
    /**
     * The identifier of an existing snapshot of application state to use to restart an application. The application uses this value if `RESTORE_FROM_CUSTOM_SNAPSHOT` is specified for `application_restore_type`.
     * 
    */
    public Optional<String> getSnapshotName() {
        return Optional.ofNullable(this.snapshotName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String applicationRestoreType;
        private @Nullable String snapshotName;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationRestoreType = defaults.applicationRestoreType;
    	      this.snapshotName = defaults.snapshotName;
        }

        public Builder applicationRestoreType(@Nullable String applicationRestoreType) {
            this.applicationRestoreType = applicationRestoreType;
            return this;
        }

        public Builder snapshotName(@Nullable String snapshotName) {
            this.snapshotName = snapshotName;
            return this;
        }
        public ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfiguration build() {
            return new ApplicationApplicationConfigurationRunConfigurationApplicationRestoreConfiguration(applicationRestoreType, snapshotName);
        }
    }
}
