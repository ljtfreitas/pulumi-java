// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebase_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IosAppArgs extends io.pulumi.resources.ResourceArgs {

    public static final IosAppArgs Empty = new IosAppArgs();

    /**
     * Immutable. The globally unique, Firebase-assigned identifier for the `IosApp`. This identifier should be treated as an opaque token, as the data format is not specified.
     * 
     */
    @Import(name="appId")
      private final @Nullable Output<String> appId;

    public Output<String> getAppId() {
        return this.appId == null ? Output.empty() : this.appId;
    }

    /**
     * The automatically generated Apple ID assigned to the iOS app by Apple in the iOS App Store.
     * 
     */
    @Import(name="appStoreId")
      private final @Nullable Output<String> appStoreId;

    public Output<String> getAppStoreId() {
        return this.appStoreId == null ? Output.empty() : this.appStoreId;
    }

    /**
     * Immutable. The canonical bundle ID of the iOS app as it would appear in the iOS AppStore.
     * 
     */
    @Import(name="bundleId")
      private final @Nullable Output<String> bundleId;

    public Output<String> getBundleId() {
        return this.bundleId == null ? Output.empty() : this.bundleId;
    }

    /**
     * The user-assigned display name for the `IosApp`.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * The resource name of the IosApp, in the format: projects/PROJECT_IDENTIFIER /iosApps/APP_ID * PROJECT_IDENTIFIER: the parent Project's [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number) ***(recommended)*** or its [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id). Learn more about using project identifiers in Google's [AIP 2510 standard](https://google.aip.dev/cloud/2510). Note that the value for PROJECT_IDENTIFIER in any response body will be the `ProjectId`. * APP_ID: the globally unique, Firebase-assigned identifier for the App (see [`appId`](../projects.iosApps#IosApp.FIELDS.app_id)).
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Immutable. A user-assigned unique identifier of the parent FirebaseProject for the `IosApp`.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The Apple Developer Team ID associated with the App in the App Store.
     * 
     */
    @Import(name="teamId")
      private final @Nullable Output<String> teamId;

    public Output<String> getTeamId() {
        return this.teamId == null ? Output.empty() : this.teamId;
    }

    public IosAppArgs(
        @Nullable Output<String> appId,
        @Nullable Output<String> appStoreId,
        @Nullable Output<String> bundleId,
        @Nullable Output<String> displayName,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> teamId) {
        this.appId = appId;
        this.appStoreId = appStoreId;
        this.bundleId = bundleId;
        this.displayName = displayName;
        this.name = name;
        this.project = project;
        this.teamId = teamId;
    }

    private IosAppArgs() {
        this.appId = Output.empty();
        this.appStoreId = Output.empty();
        this.bundleId = Output.empty();
        this.displayName = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.teamId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IosAppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> appId;
        private @Nullable Output<String> appStoreId;
        private @Nullable Output<String> bundleId;
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> teamId;

        public Builder() {
    	      // Empty
        }

        public Builder(IosAppArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.appStoreId = defaults.appStoreId;
    	      this.bundleId = defaults.bundleId;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.teamId = defaults.teamId;
        }

        public Builder appId(@Nullable Output<String> appId) {
            this.appId = appId;
            return this;
        }

        public Builder appId(@Nullable String appId) {
            this.appId = Output.ofNullable(appId);
            return this;
        }

        public Builder appStoreId(@Nullable Output<String> appStoreId) {
            this.appStoreId = appStoreId;
            return this;
        }

        public Builder appStoreId(@Nullable String appStoreId) {
            this.appStoreId = Output.ofNullable(appStoreId);
            return this;
        }

        public Builder bundleId(@Nullable Output<String> bundleId) {
            this.bundleId = bundleId;
            return this;
        }

        public Builder bundleId(@Nullable String bundleId) {
            this.bundleId = Output.ofNullable(bundleId);
            return this;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder teamId(@Nullable Output<String> teamId) {
            this.teamId = teamId;
            return this;
        }

        public Builder teamId(@Nullable String teamId) {
            this.teamId = Output.ofNullable(teamId);
            return this;
        }
        public IosAppArgs build() {
            return new IosAppArgs(appId, appStoreId, bundleId, displayName, name, project, teamId);
        }
    }
}
