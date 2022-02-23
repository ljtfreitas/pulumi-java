// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.elastic.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ElasticCloudDeploymentResponse {
    /**
     * Associated Azure subscription Id for the elastic deployment.
     * 
     */
    private final String azureSubscriptionId;
    /**
     * Elastic deployment Id
     * 
     */
    private final String deploymentId;
    /**
     * Region where Deployment at Elastic side took place.
     * 
     */
    private final String elasticsearchRegion;
    /**
     * Elasticsearch ingestion endpoint of the Elastic deployment.
     * 
     */
    private final String elasticsearchServiceUrl;
    /**
     * Kibana endpoint of the Elastic deployment.
     * 
     */
    private final String kibanaServiceUrl;
    /**
     * Kibana dashboard sso URL of the Elastic deployment.
     * 
     */
    private final String kibanaSsoUrl;
    /**
     * Elastic deployment name
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"azureSubscriptionId","deploymentId","elasticsearchRegion","elasticsearchServiceUrl","kibanaServiceUrl","kibanaSsoUrl","name"})
    private ElasticCloudDeploymentResponse(
        String azureSubscriptionId,
        String deploymentId,
        String elasticsearchRegion,
        String elasticsearchServiceUrl,
        String kibanaServiceUrl,
        String kibanaSsoUrl,
        String name) {
        this.azureSubscriptionId = Objects.requireNonNull(azureSubscriptionId);
        this.deploymentId = Objects.requireNonNull(deploymentId);
        this.elasticsearchRegion = Objects.requireNonNull(elasticsearchRegion);
        this.elasticsearchServiceUrl = Objects.requireNonNull(elasticsearchServiceUrl);
        this.kibanaServiceUrl = Objects.requireNonNull(kibanaServiceUrl);
        this.kibanaSsoUrl = Objects.requireNonNull(kibanaSsoUrl);
        this.name = Objects.requireNonNull(name);
    }

    /**
     * Associated Azure subscription Id for the elastic deployment.
     * 
     */
    public String getAzureSubscriptionId() {
        return this.azureSubscriptionId;
    }
    /**
     * Elastic deployment Id
     * 
     */
    public String getDeploymentId() {
        return this.deploymentId;
    }
    /**
     * Region where Deployment at Elastic side took place.
     * 
     */
    public String getElasticsearchRegion() {
        return this.elasticsearchRegion;
    }
    /**
     * Elasticsearch ingestion endpoint of the Elastic deployment.
     * 
     */
    public String getElasticsearchServiceUrl() {
        return this.elasticsearchServiceUrl;
    }
    /**
     * Kibana endpoint of the Elastic deployment.
     * 
     */
    public String getKibanaServiceUrl() {
        return this.kibanaServiceUrl;
    }
    /**
     * Kibana dashboard sso URL of the Elastic deployment.
     * 
     */
    public String getKibanaSsoUrl() {
        return this.kibanaSsoUrl;
    }
    /**
     * Elastic deployment name
     * 
     */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElasticCloudDeploymentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String azureSubscriptionId;
        private String deploymentId;
        private String elasticsearchRegion;
        private String elasticsearchServiceUrl;
        private String kibanaServiceUrl;
        private String kibanaSsoUrl;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ElasticCloudDeploymentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureSubscriptionId = defaults.azureSubscriptionId;
    	      this.deploymentId = defaults.deploymentId;
    	      this.elasticsearchRegion = defaults.elasticsearchRegion;
    	      this.elasticsearchServiceUrl = defaults.elasticsearchServiceUrl;
    	      this.kibanaServiceUrl = defaults.kibanaServiceUrl;
    	      this.kibanaSsoUrl = defaults.kibanaSsoUrl;
    	      this.name = defaults.name;
        }

        public Builder setAzureSubscriptionId(String azureSubscriptionId) {
            this.azureSubscriptionId = Objects.requireNonNull(azureSubscriptionId);
            return this;
        }

        public Builder setDeploymentId(String deploymentId) {
            this.deploymentId = Objects.requireNonNull(deploymentId);
            return this;
        }

        public Builder setElasticsearchRegion(String elasticsearchRegion) {
            this.elasticsearchRegion = Objects.requireNonNull(elasticsearchRegion);
            return this;
        }

        public Builder setElasticsearchServiceUrl(String elasticsearchServiceUrl) {
            this.elasticsearchServiceUrl = Objects.requireNonNull(elasticsearchServiceUrl);
            return this;
        }

        public Builder setKibanaServiceUrl(String kibanaServiceUrl) {
            this.kibanaServiceUrl = Objects.requireNonNull(kibanaServiceUrl);
            return this;
        }

        public Builder setKibanaSsoUrl(String kibanaSsoUrl) {
            this.kibanaSsoUrl = Objects.requireNonNull(kibanaSsoUrl);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public ElasticCloudDeploymentResponse build() {
            return new ElasticCloudDeploymentResponse(azureSubscriptionId, deploymentId, elasticsearchRegion, elasticsearchServiceUrl, kibanaServiceUrl, kibanaSsoUrl, name);
        }
    }
}
