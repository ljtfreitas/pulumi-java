// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudMlV1__RouteMapResponse {
    /**
     * HTTP path on the container to send health checkss to. AI Platform Prediction intermittently sends GET requests to this path on the container's IP address and port to check that the container is healthy. Read more about [health checks](/ai-platform/prediction/docs/custom-container-requirements#checks). For example, if you set this field to `/bar`, then AI Platform Prediction intermittently sends a GET request to the `/bar` path on the port of your container specified by the first value of Version.container.ports. If you don't specify this field, it defaults to the following value: /v1/models/ MODEL/versions/VERSION The placeholders in this value are replaced as follows: * MODEL: The name of the parent Model. This does not include the "projects/PROJECT_ID/models/" prefix that the API returns in output; it is the bare model name, as provided to projects.models.create. * VERSION: The name of the model version. This does not include the "projects/PROJECT_ID /models/MODEL/versions/" prefix that the API returns in output; it is the bare version name, as provided to projects.models.versions.create.
     * 
     */
    private final String health;
    /**
     * HTTP path on the container to send prediction requests to. AI Platform Prediction forwards requests sent using projects.predict to this path on the container's IP address and port. AI Platform Prediction then returns the container's response in the API response. For example, if you set this field to `/foo`, then when AI Platform Prediction receives a prediction request, it forwards the request body in a POST request to the `/foo` path on the port of your container specified by the first value of Version.container.ports. If you don't specify this field, it defaults to the following value: /v1/models/MODEL/versions/VERSION:predict The placeholders in this value are replaced as follows: * MODEL: The name of the parent Model. This does not include the "projects/PROJECT_ID/models/" prefix that the API returns in output; it is the bare model name, as provided to projects.models.create. * VERSION: The name of the model version. This does not include the "projects/PROJECT_ID/models/MODEL/versions/" prefix that the API returns in output; it is the bare version name, as provided to projects.models.versions.create.
     * 
     */
    private final String predict;

    @OutputCustomType.Constructor({"health","predict"})
    private GoogleCloudMlV1__RouteMapResponse(
        String health,
        String predict) {
        this.health = Objects.requireNonNull(health);
        this.predict = Objects.requireNonNull(predict);
    }

    /**
     * HTTP path on the container to send health checkss to. AI Platform Prediction intermittently sends GET requests to this path on the container's IP address and port to check that the container is healthy. Read more about [health checks](/ai-platform/prediction/docs/custom-container-requirements#checks). For example, if you set this field to `/bar`, then AI Platform Prediction intermittently sends a GET request to the `/bar` path on the port of your container specified by the first value of Version.container.ports. If you don't specify this field, it defaults to the following value: /v1/models/ MODEL/versions/VERSION The placeholders in this value are replaced as follows: * MODEL: The name of the parent Model. This does not include the "projects/PROJECT_ID/models/" prefix that the API returns in output; it is the bare model name, as provided to projects.models.create. * VERSION: The name of the model version. This does not include the "projects/PROJECT_ID /models/MODEL/versions/" prefix that the API returns in output; it is the bare version name, as provided to projects.models.versions.create.
     * 
     */
    public String getHealth() {
        return this.health;
    }
    /**
     * HTTP path on the container to send prediction requests to. AI Platform Prediction forwards requests sent using projects.predict to this path on the container's IP address and port. AI Platform Prediction then returns the container's response in the API response. For example, if you set this field to `/foo`, then when AI Platform Prediction receives a prediction request, it forwards the request body in a POST request to the `/foo` path on the port of your container specified by the first value of Version.container.ports. If you don't specify this field, it defaults to the following value: /v1/models/MODEL/versions/VERSION:predict The placeholders in this value are replaced as follows: * MODEL: The name of the parent Model. This does not include the "projects/PROJECT_ID/models/" prefix that the API returns in output; it is the bare model name, as provided to projects.models.create. * VERSION: The name of the model version. This does not include the "projects/PROJECT_ID/models/MODEL/versions/" prefix that the API returns in output; it is the bare version name, as provided to projects.models.versions.create.
     * 
     */
    public String getPredict() {
        return this.predict;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__RouteMapResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String health;
        private String predict;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__RouteMapResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.health = defaults.health;
    	      this.predict = defaults.predict;
        }

        public Builder setHealth(String health) {
            this.health = Objects.requireNonNull(health);
            return this;
        }

        public Builder setPredict(String predict) {
            this.predict = Objects.requireNonNull(predict);
            return this;
        }
        public GoogleCloudMlV1__RouteMapResponse build() {
            return new GoogleCloudMlV1__RouteMapResponse(health, predict);
        }
    }
}
