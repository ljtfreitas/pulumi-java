// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2StoredInfoTypeConfigArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StoredInfoTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final StoredInfoTypeArgs Empty = new StoredInfoTypeArgs();

    /**
     * Configuration of the storedInfoType to create.
     * 
     */
    @InputImport(name="config", required=true)
      private final Input<GooglePrivacyDlpV2StoredInfoTypeConfigArgs> config;

    public Input<GooglePrivacyDlpV2StoredInfoTypeConfigArgs> getConfig() {
        return this.config;
    }

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The storedInfoType ID can contain uppercase and lowercase letters, numbers, and hyphens; that is, it must match the regular expression: `[a-zA-Z\d-_]+`. The maximum length is 100 characters. Can be empty to allow the system to generate one.
     * 
     */
    @InputImport(name="storedInfoTypeId")
      private final @Nullable Input<String> storedInfoTypeId;

    public Input<String> getStoredInfoTypeId() {
        return this.storedInfoTypeId == null ? Input.empty() : this.storedInfoTypeId;
    }

    public StoredInfoTypeArgs(
        Input<GooglePrivacyDlpV2StoredInfoTypeConfigArgs> config,
        @Nullable Input<String> location,
        @Nullable Input<String> project,
        @Nullable Input<String> storedInfoTypeId) {
        this.config = Objects.requireNonNull(config, "expected parameter 'config' to be non-null");
        this.location = location;
        this.project = project;
        this.storedInfoTypeId = storedInfoTypeId;
    }

    private StoredInfoTypeArgs() {
        this.config = Input.empty();
        this.location = Input.empty();
        this.project = Input.empty();
        this.storedInfoTypeId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StoredInfoTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<GooglePrivacyDlpV2StoredInfoTypeConfigArgs> config;
        private @Nullable Input<String> location;
        private @Nullable Input<String> project;
        private @Nullable Input<String> storedInfoTypeId;

        public Builder() {
    	      // Empty
        }

        public Builder(StoredInfoTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.storedInfoTypeId = defaults.storedInfoTypeId;
        }

        public Builder setConfig(Input<GooglePrivacyDlpV2StoredInfoTypeConfigArgs> config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }

        public Builder setConfig(GooglePrivacyDlpV2StoredInfoTypeConfigArgs config) {
            this.config = Input.of(Objects.requireNonNull(config));
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setStoredInfoTypeId(@Nullable Input<String> storedInfoTypeId) {
            this.storedInfoTypeId = storedInfoTypeId;
            return this;
        }

        public Builder setStoredInfoTypeId(@Nullable String storedInfoTypeId) {
            this.storedInfoTypeId = Input.ofNullable(storedInfoTypeId);
            return this;
        }
        public StoredInfoTypeArgs build() {
            return new StoredInfoTypeArgs(config, location, project, storedInfoTypeId);
        }
    }
}
