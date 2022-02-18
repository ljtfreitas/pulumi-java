// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.ApplicationGatewayCookieBasedAffinity;
import io.pulumi.azurenative.network.enums.ApplicationGatewayProtocol;
import io.pulumi.azurenative.network.inputs.ApplicationGatewayConnectionDrainingArgs;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Backend address pool settings of an application gateway.
 * 
 */
public final class ApplicationGatewayBackendHttpSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewayBackendHttpSettingsArgs Empty = new ApplicationGatewayBackendHttpSettingsArgs();

    /**
     * Cookie name to use for the affinity cookie.
     * 
     */
    @InputImport(name="affinityCookieName")
    private final @Nullable Input<String> affinityCookieName;

    public Input<String> getAffinityCookieName() {
        return this.affinityCookieName == null ? Input.empty() : this.affinityCookieName;
    }

    /**
     * Array of references to application gateway authentication certificates.
     * 
     */
    @InputImport(name="authenticationCertificates")
    private final @Nullable Input<List<SubResourceArgs>> authenticationCertificates;

    public Input<List<SubResourceArgs>> getAuthenticationCertificates() {
        return this.authenticationCertificates == null ? Input.empty() : this.authenticationCertificates;
    }

    /**
     * Connection draining of the backend http settings resource.
     * 
     */
    @InputImport(name="connectionDraining")
    private final @Nullable Input<ApplicationGatewayConnectionDrainingArgs> connectionDraining;

    public Input<ApplicationGatewayConnectionDrainingArgs> getConnectionDraining() {
        return this.connectionDraining == null ? Input.empty() : this.connectionDraining;
    }

    /**
     * Cookie based affinity.
     * 
     */
    @InputImport(name="cookieBasedAffinity")
    private final @Nullable Input<Either<String,ApplicationGatewayCookieBasedAffinity>> cookieBasedAffinity;

    public Input<Either<String,ApplicationGatewayCookieBasedAffinity>> getCookieBasedAffinity() {
        return this.cookieBasedAffinity == null ? Input.empty() : this.cookieBasedAffinity;
    }

    /**
     * Host header to be sent to the backend servers.
     * 
     */
    @InputImport(name="hostName")
    private final @Nullable Input<String> hostName;

    public Input<String> getHostName() {
        return this.hostName == null ? Input.empty() : this.hostName;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * Name of the backend http settings that is unique within an Application Gateway.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Path which should be used as a prefix for all HTTP requests. Null means no path will be prefixed. Default value is null.
     * 
     */
    @InputImport(name="path")
    private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    /**
     * Whether to pick host header should be picked from the host name of the backend server. Default value is false.
     * 
     */
    @InputImport(name="pickHostNameFromBackendAddress")
    private final @Nullable Input<Boolean> pickHostNameFromBackendAddress;

    public Input<Boolean> getPickHostNameFromBackendAddress() {
        return this.pickHostNameFromBackendAddress == null ? Input.empty() : this.pickHostNameFromBackendAddress;
    }

    /**
     * The destination port on the backend.
     * 
     */
    @InputImport(name="port")
    private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    /**
     * Probe resource of an application gateway.
     * 
     */
    @InputImport(name="probe")
    private final @Nullable Input<SubResourceArgs> probe;

    public Input<SubResourceArgs> getProbe() {
        return this.probe == null ? Input.empty() : this.probe;
    }

    /**
     * Whether the probe is enabled. Default value is false.
     * 
     */
    @InputImport(name="probeEnabled")
    private final @Nullable Input<Boolean> probeEnabled;

    public Input<Boolean> getProbeEnabled() {
        return this.probeEnabled == null ? Input.empty() : this.probeEnabled;
    }

    /**
     * The protocol used to communicate with the backend.
     * 
     */
    @InputImport(name="protocol")
    private final @Nullable Input<Either<String,ApplicationGatewayProtocol>> protocol;

    public Input<Either<String,ApplicationGatewayProtocol>> getProtocol() {
        return this.protocol == null ? Input.empty() : this.protocol;
    }

    /**
     * Request timeout in seconds. Application Gateway will fail the request if response is not received within RequestTimeout. Acceptable values are from 1 second to 86400 seconds.
     * 
     */
    @InputImport(name="requestTimeout")
    private final @Nullable Input<Integer> requestTimeout;

    public Input<Integer> getRequestTimeout() {
        return this.requestTimeout == null ? Input.empty() : this.requestTimeout;
    }

    /**
     * Array of references to application gateway trusted root certificates.
     * 
     */
    @InputImport(name="trustedRootCertificates")
    private final @Nullable Input<List<SubResourceArgs>> trustedRootCertificates;

    public Input<List<SubResourceArgs>> getTrustedRootCertificates() {
        return this.trustedRootCertificates == null ? Input.empty() : this.trustedRootCertificates;
    }

    public ApplicationGatewayBackendHttpSettingsArgs(
        @Nullable Input<String> affinityCookieName,
        @Nullable Input<List<SubResourceArgs>> authenticationCertificates,
        @Nullable Input<ApplicationGatewayConnectionDrainingArgs> connectionDraining,
        @Nullable Input<Either<String,ApplicationGatewayCookieBasedAffinity>> cookieBasedAffinity,
        @Nullable Input<String> hostName,
        @Nullable Input<String> id,
        @Nullable Input<String> name,
        @Nullable Input<String> path,
        @Nullable Input<Boolean> pickHostNameFromBackendAddress,
        @Nullable Input<Integer> port,
        @Nullable Input<SubResourceArgs> probe,
        @Nullable Input<Boolean> probeEnabled,
        @Nullable Input<Either<String,ApplicationGatewayProtocol>> protocol,
        @Nullable Input<Integer> requestTimeout,
        @Nullable Input<List<SubResourceArgs>> trustedRootCertificates) {
        this.affinityCookieName = affinityCookieName;
        this.authenticationCertificates = authenticationCertificates;
        this.connectionDraining = connectionDraining;
        this.cookieBasedAffinity = cookieBasedAffinity;
        this.hostName = hostName;
        this.id = id;
        this.name = name;
        this.path = path;
        this.pickHostNameFromBackendAddress = pickHostNameFromBackendAddress;
        this.port = port;
        this.probe = probe;
        this.probeEnabled = probeEnabled;
        this.protocol = protocol;
        this.requestTimeout = requestTimeout;
        this.trustedRootCertificates = trustedRootCertificates;
    }

    private ApplicationGatewayBackendHttpSettingsArgs() {
        this.affinityCookieName = Input.empty();
        this.authenticationCertificates = Input.empty();
        this.connectionDraining = Input.empty();
        this.cookieBasedAffinity = Input.empty();
        this.hostName = Input.empty();
        this.id = Input.empty();
        this.name = Input.empty();
        this.path = Input.empty();
        this.pickHostNameFromBackendAddress = Input.empty();
        this.port = Input.empty();
        this.probe = Input.empty();
        this.probeEnabled = Input.empty();
        this.protocol = Input.empty();
        this.requestTimeout = Input.empty();
        this.trustedRootCertificates = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayBackendHttpSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> affinityCookieName;
        private @Nullable Input<List<SubResourceArgs>> authenticationCertificates;
        private @Nullable Input<ApplicationGatewayConnectionDrainingArgs> connectionDraining;
        private @Nullable Input<Either<String,ApplicationGatewayCookieBasedAffinity>> cookieBasedAffinity;
        private @Nullable Input<String> hostName;
        private @Nullable Input<String> id;
        private @Nullable Input<String> name;
        private @Nullable Input<String> path;
        private @Nullable Input<Boolean> pickHostNameFromBackendAddress;
        private @Nullable Input<Integer> port;
        private @Nullable Input<SubResourceArgs> probe;
        private @Nullable Input<Boolean> probeEnabled;
        private @Nullable Input<Either<String,ApplicationGatewayProtocol>> protocol;
        private @Nullable Input<Integer> requestTimeout;
        private @Nullable Input<List<SubResourceArgs>> trustedRootCertificates;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayBackendHttpSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.affinityCookieName = defaults.affinityCookieName;
    	      this.authenticationCertificates = defaults.authenticationCertificates;
    	      this.connectionDraining = defaults.connectionDraining;
    	      this.cookieBasedAffinity = defaults.cookieBasedAffinity;
    	      this.hostName = defaults.hostName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.pickHostNameFromBackendAddress = defaults.pickHostNameFromBackendAddress;
    	      this.port = defaults.port;
    	      this.probe = defaults.probe;
    	      this.probeEnabled = defaults.probeEnabled;
    	      this.protocol = defaults.protocol;
    	      this.requestTimeout = defaults.requestTimeout;
    	      this.trustedRootCertificates = defaults.trustedRootCertificates;
        }

        public Builder setAffinityCookieName(@Nullable Input<String> affinityCookieName) {
            this.affinityCookieName = affinityCookieName;
            return this;
        }

        public Builder setAffinityCookieName(@Nullable String affinityCookieName) {
            this.affinityCookieName = Input.ofNullable(affinityCookieName);
            return this;
        }

        public Builder setAuthenticationCertificates(@Nullable Input<List<SubResourceArgs>> authenticationCertificates) {
            this.authenticationCertificates = authenticationCertificates;
            return this;
        }

        public Builder setAuthenticationCertificates(@Nullable List<SubResourceArgs> authenticationCertificates) {
            this.authenticationCertificates = Input.ofNullable(authenticationCertificates);
            return this;
        }

        public Builder setConnectionDraining(@Nullable Input<ApplicationGatewayConnectionDrainingArgs> connectionDraining) {
            this.connectionDraining = connectionDraining;
            return this;
        }

        public Builder setConnectionDraining(@Nullable ApplicationGatewayConnectionDrainingArgs connectionDraining) {
            this.connectionDraining = Input.ofNullable(connectionDraining);
            return this;
        }

        public Builder setCookieBasedAffinity(@Nullable Input<Either<String,ApplicationGatewayCookieBasedAffinity>> cookieBasedAffinity) {
            this.cookieBasedAffinity = cookieBasedAffinity;
            return this;
        }

        public Builder setCookieBasedAffinity(@Nullable Either<String,ApplicationGatewayCookieBasedAffinity> cookieBasedAffinity) {
            this.cookieBasedAffinity = Input.ofNullable(cookieBasedAffinity);
            return this;
        }

        public Builder setHostName(@Nullable Input<String> hostName) {
            this.hostName = hostName;
            return this;
        }

        public Builder setHostName(@Nullable String hostName) {
            this.hostName = Input.ofNullable(hostName);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPath(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public Builder setPickHostNameFromBackendAddress(@Nullable Input<Boolean> pickHostNameFromBackendAddress) {
            this.pickHostNameFromBackendAddress = pickHostNameFromBackendAddress;
            return this;
        }

        public Builder setPickHostNameFromBackendAddress(@Nullable Boolean pickHostNameFromBackendAddress) {
            this.pickHostNameFromBackendAddress = Input.ofNullable(pickHostNameFromBackendAddress);
            return this;
        }

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setProbe(@Nullable Input<SubResourceArgs> probe) {
            this.probe = probe;
            return this;
        }

        public Builder setProbe(@Nullable SubResourceArgs probe) {
            this.probe = Input.ofNullable(probe);
            return this;
        }

        public Builder setProbeEnabled(@Nullable Input<Boolean> probeEnabled) {
            this.probeEnabled = probeEnabled;
            return this;
        }

        public Builder setProbeEnabled(@Nullable Boolean probeEnabled) {
            this.probeEnabled = Input.ofNullable(probeEnabled);
            return this;
        }

        public Builder setProtocol(@Nullable Input<Either<String,ApplicationGatewayProtocol>> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setProtocol(@Nullable Either<String,ApplicationGatewayProtocol> protocol) {
            this.protocol = Input.ofNullable(protocol);
            return this;
        }

        public Builder setRequestTimeout(@Nullable Input<Integer> requestTimeout) {
            this.requestTimeout = requestTimeout;
            return this;
        }

        public Builder setRequestTimeout(@Nullable Integer requestTimeout) {
            this.requestTimeout = Input.ofNullable(requestTimeout);
            return this;
        }

        public Builder setTrustedRootCertificates(@Nullable Input<List<SubResourceArgs>> trustedRootCertificates) {
            this.trustedRootCertificates = trustedRootCertificates;
            return this;
        }

        public Builder setTrustedRootCertificates(@Nullable List<SubResourceArgs> trustedRootCertificates) {
            this.trustedRootCertificates = Input.ofNullable(trustedRootCertificates);
            return this;
        }

        public ApplicationGatewayBackendHttpSettingsArgs build() {
            return new ApplicationGatewayBackendHttpSettingsArgs(affinityCookieName, authenticationCertificates, connectionDraining, cookieBasedAffinity, hostName, id, name, path, pickHostNameFromBackendAddress, port, probe, probeEnabled, protocol, requestTimeout, trustedRootCertificates);
        }
    }
}
