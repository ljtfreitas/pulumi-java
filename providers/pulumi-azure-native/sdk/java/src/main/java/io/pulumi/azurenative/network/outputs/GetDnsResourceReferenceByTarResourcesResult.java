// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.DnsResourceReferenceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDnsResourceReferenceByTarResourcesResult {
    /**
     * The result of dns resource reference request. A list of dns resource references for each of the azure resource in the request
     * 
     */
    private final @Nullable List<DnsResourceReferenceResponse> dnsResourceReferences;

    @OutputCustomType.Constructor({"dnsResourceReferences"})
    private GetDnsResourceReferenceByTarResourcesResult(@Nullable List<DnsResourceReferenceResponse> dnsResourceReferences) {
        this.dnsResourceReferences = dnsResourceReferences;
    }

    /**
     * The result of dns resource reference request. A list of dns resource references for each of the azure resource in the request
     * 
     */
    public List<DnsResourceReferenceResponse> getDnsResourceReferences() {
        return this.dnsResourceReferences == null ? List.of() : this.dnsResourceReferences;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDnsResourceReferenceByTarResourcesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DnsResourceReferenceResponse> dnsResourceReferences;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDnsResourceReferenceByTarResourcesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsResourceReferences = defaults.dnsResourceReferences;
        }

        public Builder setDnsResourceReferences(@Nullable List<DnsResourceReferenceResponse> dnsResourceReferences) {
            this.dnsResourceReferences = dnsResourceReferences;
            return this;
        }
        public GetDnsResourceReferenceByTarResourcesResult build() {
            return new GetDnsResourceReferenceByTarResourcesResult(dnsResourceReferences);
        }
    }
}
