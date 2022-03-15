// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.FingerprintResponse;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.LayerResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Derived describes the derived image portion (Occurrence) of the DockerImage relationship. This image would be produced from a Dockerfile with FROM .
 * 
 */
public final class DerivedResponse extends io.pulumi.resources.InvokeArgs {

    public static final DerivedResponse Empty = new DerivedResponse();

    /**
     * This contains the base image URL for the derived image occurrence.
     * 
     */
    @Import(name="baseResourceUrl", required=true)
      private final String baseResourceUrl;

    public String getBaseResourceUrl() {
        return this.baseResourceUrl;
    }

    /**
     * The number of layers by which this image differs from the associated image basis.
     * 
     */
    @Import(name="distance", required=true)
      private final Integer distance;

    public Integer getDistance() {
        return this.distance;
    }

    /**
     * The fingerprint of the derived image.
     * 
     */
    @Import(name="fingerprint", required=true)
      private final FingerprintResponse fingerprint;

    public FingerprintResponse getFingerprint() {
        return this.fingerprint;
    }

    /**
     * This contains layer-specific metadata, if populated it has length "distance" and is ordered with [distance] being the layer immediately following the base image and [1] being the final layer.
     * 
     */
    @Import(name="layerInfo", required=true)
      private final List<LayerResponse> layerInfo;

    public List<LayerResponse> getLayerInfo() {
        return this.layerInfo;
    }

    public DerivedResponse(
        String baseResourceUrl,
        Integer distance,
        FingerprintResponse fingerprint,
        List<LayerResponse> layerInfo) {
        this.baseResourceUrl = Objects.requireNonNull(baseResourceUrl, "expected parameter 'baseResourceUrl' to be non-null");
        this.distance = Objects.requireNonNull(distance, "expected parameter 'distance' to be non-null");
        this.fingerprint = Objects.requireNonNull(fingerprint, "expected parameter 'fingerprint' to be non-null");
        this.layerInfo = Objects.requireNonNull(layerInfo, "expected parameter 'layerInfo' to be non-null");
    }

    private DerivedResponse() {
        this.baseResourceUrl = null;
        this.distance = null;
        this.fingerprint = null;
        this.layerInfo = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DerivedResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String baseResourceUrl;
        private Integer distance;
        private FingerprintResponse fingerprint;
        private List<LayerResponse> layerInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(DerivedResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseResourceUrl = defaults.baseResourceUrl;
    	      this.distance = defaults.distance;
    	      this.fingerprint = defaults.fingerprint;
    	      this.layerInfo = defaults.layerInfo;
        }

        public Builder baseResourceUrl(String baseResourceUrl) {
            this.baseResourceUrl = Objects.requireNonNull(baseResourceUrl);
            return this;
        }

        public Builder distance(Integer distance) {
            this.distance = Objects.requireNonNull(distance);
            return this;
        }

        public Builder fingerprint(FingerprintResponse fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }

        public Builder layerInfo(List<LayerResponse> layerInfo) {
            this.layerInfo = Objects.requireNonNull(layerInfo);
            return this;
        }
        public DerivedResponse build() {
            return new DerivedResponse(baseResourceUrl, distance, fingerprint, layerInfo);
        }
    }
}
