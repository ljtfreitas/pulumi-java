// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datastream_v1alpha1.inputs.ForwardSshTunnelConnectivityArgs;
import io.pulumi.googlenative.datastream_v1alpha1.inputs.GcsProfileArgs;
import io.pulumi.googlenative.datastream_v1alpha1.inputs.MysqlProfileArgs;
import io.pulumi.googlenative.datastream_v1alpha1.inputs.NoConnectivitySettingsArgs;
import io.pulumi.googlenative.datastream_v1alpha1.inputs.OracleProfileArgs;
import io.pulumi.googlenative.datastream_v1alpha1.inputs.PrivateConnectivityArgs;
import io.pulumi.googlenative.datastream_v1alpha1.inputs.StaticServiceIpConnectivityArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectionProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionProfileArgs Empty = new ConnectionProfileArgs();

    @InputImport(name="connectionProfileId", required=true)
      private final Input<String> connectionProfileId;

    public Input<String> getConnectionProfileId() {
        return this.connectionProfileId;
    }

    /**
     * Display name.
     * 
     */
    @InputImport(name="displayName", required=true)
      private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Forward SSH tunnel connectivity.
     * 
     */
    @InputImport(name="forwardSshConnectivity")
      private final @Nullable Input<ForwardSshTunnelConnectivityArgs> forwardSshConnectivity;

    public Input<ForwardSshTunnelConnectivityArgs> getForwardSshConnectivity() {
        return this.forwardSshConnectivity == null ? Input.empty() : this.forwardSshConnectivity;
    }

    /**
     * Cloud Storage ConnectionProfile configuration.
     * 
     */
    @InputImport(name="gcsProfile")
      private final @Nullable Input<GcsProfileArgs> gcsProfile;

    public Input<GcsProfileArgs> getGcsProfile() {
        return this.gcsProfile == null ? Input.empty() : this.gcsProfile;
    }

    /**
     * Labels.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * MySQL ConnectionProfile configuration.
     * 
     */
    @InputImport(name="mysqlProfile")
      private final @Nullable Input<MysqlProfileArgs> mysqlProfile;

    public Input<MysqlProfileArgs> getMysqlProfile() {
        return this.mysqlProfile == null ? Input.empty() : this.mysqlProfile;
    }

    /**
     * No connectivity option chosen.
     * 
     */
    @InputImport(name="noConnectivity")
      private final @Nullable Input<NoConnectivitySettingsArgs> noConnectivity;

    public Input<NoConnectivitySettingsArgs> getNoConnectivity() {
        return this.noConnectivity == null ? Input.empty() : this.noConnectivity;
    }

    /**
     * Oracle ConnectionProfile configuration.
     * 
     */
    @InputImport(name="oracleProfile")
      private final @Nullable Input<OracleProfileArgs> oracleProfile;

    public Input<OracleProfileArgs> getOracleProfile() {
        return this.oracleProfile == null ? Input.empty() : this.oracleProfile;
    }

    /**
     * Private connectivity.
     * 
     */
    @InputImport(name="privateConnectivity")
      private final @Nullable Input<PrivateConnectivityArgs> privateConnectivity;

    public Input<PrivateConnectivityArgs> getPrivateConnectivity() {
        return this.privateConnectivity == null ? Input.empty() : this.privateConnectivity;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="requestId")
      private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * Static Service IP connectivity.
     * 
     */
    @InputImport(name="staticServiceIpConnectivity")
      private final @Nullable Input<StaticServiceIpConnectivityArgs> staticServiceIpConnectivity;

    public Input<StaticServiceIpConnectivityArgs> getStaticServiceIpConnectivity() {
        return this.staticServiceIpConnectivity == null ? Input.empty() : this.staticServiceIpConnectivity;
    }

    public ConnectionProfileArgs(
        Input<String> connectionProfileId,
        Input<String> displayName,
        @Nullable Input<ForwardSshTunnelConnectivityArgs> forwardSshConnectivity,
        @Nullable Input<GcsProfileArgs> gcsProfile,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<MysqlProfileArgs> mysqlProfile,
        @Nullable Input<NoConnectivitySettingsArgs> noConnectivity,
        @Nullable Input<OracleProfileArgs> oracleProfile,
        @Nullable Input<PrivateConnectivityArgs> privateConnectivity,
        @Nullable Input<String> project,
        @Nullable Input<String> requestId,
        @Nullable Input<StaticServiceIpConnectivityArgs> staticServiceIpConnectivity) {
        this.connectionProfileId = Objects.requireNonNull(connectionProfileId, "expected parameter 'connectionProfileId' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.forwardSshConnectivity = forwardSshConnectivity;
        this.gcsProfile = gcsProfile;
        this.labels = labels;
        this.location = location;
        this.mysqlProfile = mysqlProfile;
        this.noConnectivity = noConnectivity;
        this.oracleProfile = oracleProfile;
        this.privateConnectivity = privateConnectivity;
        this.project = project;
        this.requestId = requestId;
        this.staticServiceIpConnectivity = staticServiceIpConnectivity;
    }

    private ConnectionProfileArgs() {
        this.connectionProfileId = Input.empty();
        this.displayName = Input.empty();
        this.forwardSshConnectivity = Input.empty();
        this.gcsProfile = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.mysqlProfile = Input.empty();
        this.noConnectivity = Input.empty();
        this.oracleProfile = Input.empty();
        this.privateConnectivity = Input.empty();
        this.project = Input.empty();
        this.requestId = Input.empty();
        this.staticServiceIpConnectivity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> connectionProfileId;
        private Input<String> displayName;
        private @Nullable Input<ForwardSshTunnelConnectivityArgs> forwardSshConnectivity;
        private @Nullable Input<GcsProfileArgs> gcsProfile;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<MysqlProfileArgs> mysqlProfile;
        private @Nullable Input<NoConnectivitySettingsArgs> noConnectivity;
        private @Nullable Input<OracleProfileArgs> oracleProfile;
        private @Nullable Input<PrivateConnectivityArgs> privateConnectivity;
        private @Nullable Input<String> project;
        private @Nullable Input<String> requestId;
        private @Nullable Input<StaticServiceIpConnectivityArgs> staticServiceIpConnectivity;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionProfileId = defaults.connectionProfileId;
    	      this.displayName = defaults.displayName;
    	      this.forwardSshConnectivity = defaults.forwardSshConnectivity;
    	      this.gcsProfile = defaults.gcsProfile;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.mysqlProfile = defaults.mysqlProfile;
    	      this.noConnectivity = defaults.noConnectivity;
    	      this.oracleProfile = defaults.oracleProfile;
    	      this.privateConnectivity = defaults.privateConnectivity;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.staticServiceIpConnectivity = defaults.staticServiceIpConnectivity;
        }

        public Builder setConnectionProfileId(Input<String> connectionProfileId) {
            this.connectionProfileId = Objects.requireNonNull(connectionProfileId);
            return this;
        }

        public Builder setConnectionProfileId(String connectionProfileId) {
            this.connectionProfileId = Input.of(Objects.requireNonNull(connectionProfileId));
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setForwardSshConnectivity(@Nullable Input<ForwardSshTunnelConnectivityArgs> forwardSshConnectivity) {
            this.forwardSshConnectivity = forwardSshConnectivity;
            return this;
        }

        public Builder setForwardSshConnectivity(@Nullable ForwardSshTunnelConnectivityArgs forwardSshConnectivity) {
            this.forwardSshConnectivity = Input.ofNullable(forwardSshConnectivity);
            return this;
        }

        public Builder setGcsProfile(@Nullable Input<GcsProfileArgs> gcsProfile) {
            this.gcsProfile = gcsProfile;
            return this;
        }

        public Builder setGcsProfile(@Nullable GcsProfileArgs gcsProfile) {
            this.gcsProfile = Input.ofNullable(gcsProfile);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
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

        public Builder setMysqlProfile(@Nullable Input<MysqlProfileArgs> mysqlProfile) {
            this.mysqlProfile = mysqlProfile;
            return this;
        }

        public Builder setMysqlProfile(@Nullable MysqlProfileArgs mysqlProfile) {
            this.mysqlProfile = Input.ofNullable(mysqlProfile);
            return this;
        }

        public Builder setNoConnectivity(@Nullable Input<NoConnectivitySettingsArgs> noConnectivity) {
            this.noConnectivity = noConnectivity;
            return this;
        }

        public Builder setNoConnectivity(@Nullable NoConnectivitySettingsArgs noConnectivity) {
            this.noConnectivity = Input.ofNullable(noConnectivity);
            return this;
        }

        public Builder setOracleProfile(@Nullable Input<OracleProfileArgs> oracleProfile) {
            this.oracleProfile = oracleProfile;
            return this;
        }

        public Builder setOracleProfile(@Nullable OracleProfileArgs oracleProfile) {
            this.oracleProfile = Input.ofNullable(oracleProfile);
            return this;
        }

        public Builder setPrivateConnectivity(@Nullable Input<PrivateConnectivityArgs> privateConnectivity) {
            this.privateConnectivity = privateConnectivity;
            return this;
        }

        public Builder setPrivateConnectivity(@Nullable PrivateConnectivityArgs privateConnectivity) {
            this.privateConnectivity = Input.ofNullable(privateConnectivity);
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

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setStaticServiceIpConnectivity(@Nullable Input<StaticServiceIpConnectivityArgs> staticServiceIpConnectivity) {
            this.staticServiceIpConnectivity = staticServiceIpConnectivity;
            return this;
        }

        public Builder setStaticServiceIpConnectivity(@Nullable StaticServiceIpConnectivityArgs staticServiceIpConnectivity) {
            this.staticServiceIpConnectivity = Input.ofNullable(staticServiceIpConnectivity);
            return this;
        }
        public ConnectionProfileArgs build() {
            return new ConnectionProfileArgs(connectionProfileId, displayName, forwardSshConnectivity, gcsProfile, labels, location, mysqlProfile, noConnectivity, oracleProfile, privateConnectivity, project, requestId, staticServiceIpConnectivity);
        }
    }
}
