// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetImageVersionsImageVersion {
    /**
     * The string identifier of the image version, in the form: "composer-x.y.z-airflow-a.b(.c)"
     * 
     */
    private final String imageVersionId;
    /**
     * Supported python versions for this image version
     * 
     */
    private final List<String> supportedPythonVersions;

    @CustomType.Constructor
    private GetImageVersionsImageVersion(
        @CustomType.Parameter("imageVersionId") String imageVersionId,
        @CustomType.Parameter("supportedPythonVersions") List<String> supportedPythonVersions) {
        this.imageVersionId = imageVersionId;
        this.supportedPythonVersions = supportedPythonVersions;
    }

    /**
     * The string identifier of the image version, in the form: "composer-x.y.z-airflow-a.b(.c)"
     * 
    */
    public String getImageVersionId() {
        return this.imageVersionId;
    }
    /**
     * Supported python versions for this image version
     * 
    */
    public List<String> getSupportedPythonVersions() {
        return this.supportedPythonVersions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageVersionsImageVersion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String imageVersionId;
        private List<String> supportedPythonVersions;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImageVersionsImageVersion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageVersionId = defaults.imageVersionId;
    	      this.supportedPythonVersions = defaults.supportedPythonVersions;
        }

        public Builder imageVersionId(String imageVersionId) {
            this.imageVersionId = Objects.requireNonNull(imageVersionId);
            return this;
        }

        public Builder supportedPythonVersions(List<String> supportedPythonVersions) {
            this.supportedPythonVersions = Objects.requireNonNull(supportedPythonVersions);
            return this;
        }
        public GetImageVersionsImageVersion build() {
            return new GetImageVersionsImageVersion(imageVersionId, supportedPythonVersions);
        }
    }
}
