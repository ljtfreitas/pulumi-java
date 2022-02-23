// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.elastic.outputs;

import io.pulumi.azurenative.elastic.outputs.ElasticCloudDeploymentResponse;
import io.pulumi.azurenative.elastic.outputs.ElasticCloudUserResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ElasticPropertiesResponse {
    /**
     * Details of the elastic cloud deployment.
     * 
     */
    private final @Nullable ElasticCloudDeploymentResponse elasticCloudDeployment;
    /**
     * Details of the user's elastic account.
     * 
     */
    private final @Nullable ElasticCloudUserResponse elasticCloudUser;

    @OutputCustomType.Constructor({"elasticCloudDeployment","elasticCloudUser"})
    private ElasticPropertiesResponse(
        @Nullable ElasticCloudDeploymentResponse elasticCloudDeployment,
        @Nullable ElasticCloudUserResponse elasticCloudUser) {
        this.elasticCloudDeployment = elasticCloudDeployment;
        this.elasticCloudUser = elasticCloudUser;
    }

    /**
     * Details of the elastic cloud deployment.
     * 
     */
    public Optional<ElasticCloudDeploymentResponse> getElasticCloudDeployment() {
        return Optional.ofNullable(this.elasticCloudDeployment);
    }
    /**
     * Details of the user's elastic account.
     * 
     */
    public Optional<ElasticCloudUserResponse> getElasticCloudUser() {
        return Optional.ofNullable(this.elasticCloudUser);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElasticPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ElasticCloudDeploymentResponse elasticCloudDeployment;
        private @Nullable ElasticCloudUserResponse elasticCloudUser;

        public Builder() {
    	      // Empty
        }

        public Builder(ElasticPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.elasticCloudDeployment = defaults.elasticCloudDeployment;
    	      this.elasticCloudUser = defaults.elasticCloudUser;
        }

        public Builder setElasticCloudDeployment(@Nullable ElasticCloudDeploymentResponse elasticCloudDeployment) {
            this.elasticCloudDeployment = elasticCloudDeployment;
            return this;
        }

        public Builder setElasticCloudUser(@Nullable ElasticCloudUserResponse elasticCloudUser) {
            this.elasticCloudUser = elasticCloudUser;
            return this;
        }
        public ElasticPropertiesResponse build() {
            return new ElasticPropertiesResponse(elasticCloudDeployment, elasticCloudUser);
        }
    }
}
