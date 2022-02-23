// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The kubernetes service connection configuration
 * 
 */
public final class DefenderForContainersAwsOfferingResponseKubernetesService extends io.pulumi.resources.InvokeArgs {

    public static final DefenderForContainersAwsOfferingResponseKubernetesService Empty = new DefenderForContainersAwsOfferingResponseKubernetesService();

    /**
     * The cloud role ARN in AWS for this feature
     * 
     */
    @InputImport(name="cloudRoleArn")
        private final @Nullable String cloudRoleArn;

    public Optional<String> getCloudRoleArn() {
        return this.cloudRoleArn == null ? Optional.empty() : Optional.ofNullable(this.cloudRoleArn);
    }

    public DefenderForContainersAwsOfferingResponseKubernetesService(@Nullable String cloudRoleArn) {
        this.cloudRoleArn = cloudRoleArn;
    }

    private DefenderForContainersAwsOfferingResponseKubernetesService() {
        this.cloudRoleArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefenderForContainersAwsOfferingResponseKubernetesService defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cloudRoleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DefenderForContainersAwsOfferingResponseKubernetesService defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudRoleArn = defaults.cloudRoleArn;
        }

        public Builder setCloudRoleArn(@Nullable String cloudRoleArn) {
            this.cloudRoleArn = cloudRoleArn;
            return this;
        }
        public DefenderForContainersAwsOfferingResponseKubernetesService build() {
            return new DefenderForContainersAwsOfferingResponseKubernetesService(cloudRoleArn);
        }
    }
}
