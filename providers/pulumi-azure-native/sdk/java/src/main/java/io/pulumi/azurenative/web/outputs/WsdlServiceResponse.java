// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class WsdlServiceResponse {
    /**
     * List of the endpoints' qualified names
     * 
     */
    private final @Nullable List<String> endpointQualifiedNames;
    /**
     * The service's qualified name
     * 
     */
    private final String qualifiedName;

    @OutputCustomType.Constructor({"endpointQualifiedNames","qualifiedName"})
    private WsdlServiceResponse(
        @Nullable List<String> endpointQualifiedNames,
        String qualifiedName) {
        this.endpointQualifiedNames = endpointQualifiedNames;
        this.qualifiedName = Objects.requireNonNull(qualifiedName);
    }

    /**
     * List of the endpoints' qualified names
     * 
     */
    public List<String> getEndpointQualifiedNames() {
        return this.endpointQualifiedNames == null ? List.of() : this.endpointQualifiedNames;
    }
    /**
     * The service's qualified name
     * 
     */
    public String getQualifiedName() {
        return this.qualifiedName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WsdlServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> endpointQualifiedNames;
        private String qualifiedName;

        public Builder() {
    	      // Empty
        }

        public Builder(WsdlServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointQualifiedNames = defaults.endpointQualifiedNames;
    	      this.qualifiedName = defaults.qualifiedName;
        }

        public Builder setEndpointQualifiedNames(@Nullable List<String> endpointQualifiedNames) {
            this.endpointQualifiedNames = endpointQualifiedNames;
            return this;
        }

        public Builder setQualifiedName(String qualifiedName) {
            this.qualifiedName = Objects.requireNonNull(qualifiedName);
            return this;
        }
        public WsdlServiceResponse build() {
            return new WsdlServiceResponse(endpointQualifiedNames, qualifiedName);
        }
    }
}
