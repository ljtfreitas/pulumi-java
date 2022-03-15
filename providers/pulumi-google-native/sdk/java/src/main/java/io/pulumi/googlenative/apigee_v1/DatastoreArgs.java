// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1DatastoreConfigArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatastoreArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatastoreArgs Empty = new DatastoreArgs();

    /**
     * Datastore Configurations.
     * 
     */
    @Import(name="datastoreConfig")
      private final @Nullable Output<GoogleCloudApigeeV1DatastoreConfigArgs> datastoreConfig;

    public Output<GoogleCloudApigeeV1DatastoreConfigArgs> getDatastoreConfig() {
        return this.datastoreConfig == null ? Output.empty() : this.datastoreConfig;
    }

    /**
     * Display name in UI
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }

    @Import(name="organizationId", required=true)
      private final Output<String> organizationId;

    public Output<String> getOrganizationId() {
        return this.organizationId;
    }

    /**
     * Destination storage type. Supported types `gcs` or `bigquery`.
     * 
     */
    @Import(name="targetType")
      private final @Nullable Output<String> targetType;

    public Output<String> getTargetType() {
        return this.targetType == null ? Output.empty() : this.targetType;
    }

    public DatastoreArgs(
        @Nullable Output<GoogleCloudApigeeV1DatastoreConfigArgs> datastoreConfig,
        Output<String> displayName,
        Output<String> organizationId,
        @Nullable Output<String> targetType) {
        this.datastoreConfig = datastoreConfig;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
        this.targetType = targetType;
    }

    private DatastoreArgs() {
        this.datastoreConfig = Output.empty();
        this.displayName = Output.empty();
        this.organizationId = Output.empty();
        this.targetType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatastoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GoogleCloudApigeeV1DatastoreConfigArgs> datastoreConfig;
        private Output<String> displayName;
        private Output<String> organizationId;
        private @Nullable Output<String> targetType;

        public Builder() {
    	      // Empty
        }

        public Builder(DatastoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datastoreConfig = defaults.datastoreConfig;
    	      this.displayName = defaults.displayName;
    	      this.organizationId = defaults.organizationId;
    	      this.targetType = defaults.targetType;
        }

        public Builder datastoreConfig(@Nullable Output<GoogleCloudApigeeV1DatastoreConfigArgs> datastoreConfig) {
            this.datastoreConfig = datastoreConfig;
            return this;
        }

        public Builder datastoreConfig(@Nullable GoogleCloudApigeeV1DatastoreConfigArgs datastoreConfig) {
            this.datastoreConfig = Output.ofNullable(datastoreConfig);
            return this;
        }

        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder organizationId(Output<String> organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }

        public Builder organizationId(String organizationId) {
            this.organizationId = Output.of(Objects.requireNonNull(organizationId));
            return this;
        }

        public Builder targetType(@Nullable Output<String> targetType) {
            this.targetType = targetType;
            return this;
        }

        public Builder targetType(@Nullable String targetType) {
            this.targetType = Output.ofNullable(targetType);
            return this;
        }
        public DatastoreArgs build() {
            return new DatastoreArgs(datastoreConfig, displayName, organizationId, targetType);
        }
    }
}
