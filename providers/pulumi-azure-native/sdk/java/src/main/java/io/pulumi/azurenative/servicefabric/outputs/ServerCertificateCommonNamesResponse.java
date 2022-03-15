// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.outputs;

import io.pulumi.azurenative.servicefabric.outputs.ServerCertificateCommonNameResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServerCertificateCommonNamesResponse {
    /**
     * The list of server certificates referenced by common name that are used to secure the cluster.
     * 
     */
    private final @Nullable List<ServerCertificateCommonNameResponse> commonNames;
    /**
     * The local certificate store location.
     * 
     */
    private final @Nullable String x509StoreName;

    @CustomType.Constructor
    private ServerCertificateCommonNamesResponse(
        @CustomType.Parameter("commonNames") @Nullable List<ServerCertificateCommonNameResponse> commonNames,
        @CustomType.Parameter("x509StoreName") @Nullable String x509StoreName) {
        this.commonNames = commonNames;
        this.x509StoreName = x509StoreName;
    }

    /**
     * The list of server certificates referenced by common name that are used to secure the cluster.
     * 
    */
    public List<ServerCertificateCommonNameResponse> getCommonNames() {
        return this.commonNames == null ? List.of() : this.commonNames;
    }
    /**
     * The local certificate store location.
     * 
    */
    public Optional<String> getX509StoreName() {
        return Optional.ofNullable(this.x509StoreName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerCertificateCommonNamesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ServerCertificateCommonNameResponse> commonNames;
        private @Nullable String x509StoreName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerCertificateCommonNamesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commonNames = defaults.commonNames;
    	      this.x509StoreName = defaults.x509StoreName;
        }

        public Builder commonNames(@Nullable List<ServerCertificateCommonNameResponse> commonNames) {
            this.commonNames = commonNames;
            return this;
        }

        public Builder x509StoreName(@Nullable String x509StoreName) {
            this.x509StoreName = x509StoreName;
            return this;
        }
        public ServerCertificateCommonNamesResponse build() {
            return new ServerCertificateCommonNamesResponse(commonNames, x509StoreName);
        }
    }
}
