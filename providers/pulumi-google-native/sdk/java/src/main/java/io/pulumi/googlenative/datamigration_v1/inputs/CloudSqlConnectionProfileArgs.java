// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datamigration_v1.inputs.CloudSqlSettingsArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies required connection parameters, and, optionally, the parameters required to create a Cloud SQL destination database instance.
 * 
 */
public final class CloudSqlConnectionProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloudSqlConnectionProfileArgs Empty = new CloudSqlConnectionProfileArgs();

    /**
     * Immutable. Metadata used to create the destination Cloud SQL database.
     * 
     */
    @InputImport(name="settings")
      private final @Nullable Input<CloudSqlSettingsArgs> settings;

    public Input<CloudSqlSettingsArgs> getSettings() {
        return this.settings == null ? Input.empty() : this.settings;
    }

    public CloudSqlConnectionProfileArgs(@Nullable Input<CloudSqlSettingsArgs> settings) {
        this.settings = settings;
    }

    private CloudSqlConnectionProfileArgs() {
        this.settings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudSqlConnectionProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CloudSqlSettingsArgs> settings;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudSqlConnectionProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.settings = defaults.settings;
        }

        public Builder setSettings(@Nullable Input<CloudSqlSettingsArgs> settings) {
            this.settings = settings;
            return this;
        }

        public Builder setSettings(@Nullable CloudSqlSettingsArgs settings) {
            this.settings = Input.ofNullable(settings);
            return this;
        }
        public CloudSqlConnectionProfileArgs build() {
            return new CloudSqlConnectionProfileArgs(settings);
        }
    }
}
