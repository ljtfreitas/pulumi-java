// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ResourceOptionsResponse {
    /**
     * @return Optional. The Connect agent version to use for connect_resources. Defaults to the latest GKE Connect version. The version must be a currently supported version, obsolete versions will be rejected.
     * 
     */
    private final String connectVersion;
    /**
     * @return Optional. Major version of the Kubernetes cluster. This is only used to determine which version to use for the CustomResourceDefinition resources, `apiextensions/v1beta1` or`apiextensions/v1`.
     * 
     */
    private final String k8sVersion;
    /**
     * @return Optional. Use `apiextensions/v1beta1` instead of `apiextensions/v1` for CustomResourceDefinition resources. This option should be set for clusters with Kubernetes apiserver versions &lt;1.16.
     * 
     */
    private final Boolean v1beta1Crd;

    @CustomType.Constructor
    private ResourceOptionsResponse(
        @CustomType.Parameter("connectVersion") String connectVersion,
        @CustomType.Parameter("k8sVersion") String k8sVersion,
        @CustomType.Parameter("v1beta1Crd") Boolean v1beta1Crd) {
        this.connectVersion = connectVersion;
        this.k8sVersion = k8sVersion;
        this.v1beta1Crd = v1beta1Crd;
    }

    /**
     * @return Optional. The Connect agent version to use for connect_resources. Defaults to the latest GKE Connect version. The version must be a currently supported version, obsolete versions will be rejected.
     * 
     */
    public String connectVersion() {
        return this.connectVersion;
    }
    /**
     * @return Optional. Major version of the Kubernetes cluster. This is only used to determine which version to use for the CustomResourceDefinition resources, `apiextensions/v1beta1` or`apiextensions/v1`.
     * 
     */
    public String k8sVersion() {
        return this.k8sVersion;
    }
    /**
     * @return Optional. Use `apiextensions/v1beta1` instead of `apiextensions/v1` for CustomResourceDefinition resources. This option should be set for clusters with Kubernetes apiserver versions &lt;1.16.
     * 
     */
    public Boolean v1beta1Crd() {
        return this.v1beta1Crd;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectVersion;
        private String k8sVersion;
        private Boolean v1beta1Crd;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectVersion = defaults.connectVersion;
    	      this.k8sVersion = defaults.k8sVersion;
    	      this.v1beta1Crd = defaults.v1beta1Crd;
        }

        public Builder connectVersion(String connectVersion) {
            this.connectVersion = Objects.requireNonNull(connectVersion);
            return this;
        }
        public Builder k8sVersion(String k8sVersion) {
            this.k8sVersion = Objects.requireNonNull(k8sVersion);
            return this;
        }
        public Builder v1beta1Crd(Boolean v1beta1Crd) {
            this.v1beta1Crd = Objects.requireNonNull(v1beta1Crd);
            return this;
        }        public ResourceOptionsResponse build() {
            return new ResourceOptionsResponse(connectVersion, k8sVersion, v1beta1Crd);
        }
    }
}
