// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningcompute.inputs;

import io.pulumi.azurenative.machinelearningcompute.inputs.ServicePrincipalPropertiesResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Information about the Azure Container Registry which contains the images deployed to the cluster.
 * 
 */
public final class ContainerServiceCredentialsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContainerServiceCredentialsResponse Empty = new ContainerServiceCredentialsResponse();

    /**
     * The ACS kube config file.
     * 
     */
    @InputImport(name="acsKubeConfig", required=true)
    private final String acsKubeConfig;

    public String getAcsKubeConfig() {
        return this.acsKubeConfig;
    }

    /**
     * The ACR image pull secret name which was created in Kubernetes.
     * 
     */
    @InputImport(name="imagePullSecretName", required=true)
    private final String imagePullSecretName;

    public String getImagePullSecretName() {
        return this.imagePullSecretName;
    }

    /**
     * Service principal configuration used by Kubernetes.
     * 
     */
    @InputImport(name="servicePrincipalConfiguration", required=true)
    private final ServicePrincipalPropertiesResponse servicePrincipalConfiguration;

    public ServicePrincipalPropertiesResponse getServicePrincipalConfiguration() {
        return this.servicePrincipalConfiguration;
    }

    public ContainerServiceCredentialsResponse(
        String acsKubeConfig,
        String imagePullSecretName,
        ServicePrincipalPropertiesResponse servicePrincipalConfiguration) {
        this.acsKubeConfig = Objects.requireNonNull(acsKubeConfig, "expected parameter 'acsKubeConfig' to be non-null");
        this.imagePullSecretName = Objects.requireNonNull(imagePullSecretName, "expected parameter 'imagePullSecretName' to be non-null");
        this.servicePrincipalConfiguration = Objects.requireNonNull(servicePrincipalConfiguration, "expected parameter 'servicePrincipalConfiguration' to be non-null");
    }

    private ContainerServiceCredentialsResponse() {
        this.acsKubeConfig = null;
        this.imagePullSecretName = null;
        this.servicePrincipalConfiguration = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerServiceCredentialsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String acsKubeConfig;
        private String imagePullSecretName;
        private ServicePrincipalPropertiesResponse servicePrincipalConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerServiceCredentialsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acsKubeConfig = defaults.acsKubeConfig;
    	      this.imagePullSecretName = defaults.imagePullSecretName;
    	      this.servicePrincipalConfiguration = defaults.servicePrincipalConfiguration;
        }

        public Builder setAcsKubeConfig(String acsKubeConfig) {
            this.acsKubeConfig = Objects.requireNonNull(acsKubeConfig);
            return this;
        }

        public Builder setImagePullSecretName(String imagePullSecretName) {
            this.imagePullSecretName = Objects.requireNonNull(imagePullSecretName);
            return this;
        }

        public Builder setServicePrincipalConfiguration(ServicePrincipalPropertiesResponse servicePrincipalConfiguration) {
            this.servicePrincipalConfiguration = Objects.requireNonNull(servicePrincipalConfiguration);
            return this;
        }

        public ContainerServiceCredentialsResponse build() {
            return new ContainerServiceCredentialsResponse(acsKubeConfig, imagePullSecretName, servicePrincipalConfiguration);
        }
    }
}
