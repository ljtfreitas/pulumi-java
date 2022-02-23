// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudkms_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudkms_v1.inputs.CertificateResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A ServiceResolver represents an EKM replica that can be reached within an EkmConnection.
 * 
 */
public final class ServiceResolverResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceResolverResponse Empty = new ServiceResolverResponse();

    /**
     * Optional. The filter applied to the endpoints of the resolved service. If no filter is specified, all endpoints will be considered. An endpoint will be chosen arbitrarily from the filtered list for each request. For endpoint filter syntax and examples, see https://cloud.google.com/service-directory/docs/reference/rpc/google.cloud.servicedirectory.v1#resolveservicerequest.
     * 
     */
    @InputImport(name="endpointFilter", required=true)
      private final String endpointFilter;

    public String getEndpointFilter() {
        return this.endpointFilter;
    }

    /**
     * The hostname of the EKM replica used at TLS and HTTP layers.
     * 
     */
    @InputImport(name="hostname", required=true)
      private final String hostname;

    public String getHostname() {
        return this.hostname;
    }

    /**
     * A list of leaf server certificates used to authenticate HTTPS connections to the EKM replica.
     * 
     */
    @InputImport(name="serverCertificates", required=true)
      private final List<CertificateResponse> serverCertificates;

    public List<CertificateResponse> getServerCertificates() {
        return this.serverCertificates;
    }

    /**
     * The resource name of the Service Directory service pointing to an EKM replica, in the format `projects/*{@literal /}locations/*{@literal /}namespaces/*{@literal /}services/*`.
     * 
     */
    @InputImport(name="serviceDirectoryService", required=true)
      private final String serviceDirectoryService;

    public String getServiceDirectoryService() {
        return this.serviceDirectoryService;
    }

    public ServiceResolverResponse(
        String endpointFilter,
        String hostname,
        List<CertificateResponse> serverCertificates,
        String serviceDirectoryService) {
        this.endpointFilter = Objects.requireNonNull(endpointFilter, "expected parameter 'endpointFilter' to be non-null");
        this.hostname = Objects.requireNonNull(hostname, "expected parameter 'hostname' to be non-null");
        this.serverCertificates = Objects.requireNonNull(serverCertificates, "expected parameter 'serverCertificates' to be non-null");
        this.serviceDirectoryService = Objects.requireNonNull(serviceDirectoryService, "expected parameter 'serviceDirectoryService' to be non-null");
    }

    private ServiceResolverResponse() {
        this.endpointFilter = null;
        this.hostname = null;
        this.serverCertificates = List.of();
        this.serviceDirectoryService = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceResolverResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpointFilter;
        private String hostname;
        private List<CertificateResponse> serverCertificates;
        private String serviceDirectoryService;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceResolverResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointFilter = defaults.endpointFilter;
    	      this.hostname = defaults.hostname;
    	      this.serverCertificates = defaults.serverCertificates;
    	      this.serviceDirectoryService = defaults.serviceDirectoryService;
        }

        public Builder setEndpointFilter(String endpointFilter) {
            this.endpointFilter = Objects.requireNonNull(endpointFilter);
            return this;
        }

        public Builder setHostname(String hostname) {
            this.hostname = Objects.requireNonNull(hostname);
            return this;
        }

        public Builder setServerCertificates(List<CertificateResponse> serverCertificates) {
            this.serverCertificates = Objects.requireNonNull(serverCertificates);
            return this;
        }

        public Builder setServiceDirectoryService(String serviceDirectoryService) {
            this.serviceDirectoryService = Objects.requireNonNull(serviceDirectoryService);
            return this;
        }
        public ServiceResolverResponse build() {
            return new ServiceResolverResponse(endpointFilter, hostname, serverCertificates, serviceDirectoryService);
        }
    }
}
