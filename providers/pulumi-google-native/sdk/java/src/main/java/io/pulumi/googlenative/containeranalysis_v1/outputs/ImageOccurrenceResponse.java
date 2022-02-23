// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1.outputs.FingerprintResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.LayerResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ImageOccurrenceResponse {
    /**
     * This contains the base image URL for the derived image occurrence.
     * 
     */
    private final String baseResourceUrl;
    /**
     * The number of layers by which this image differs from the associated image basis.
     * 
     */
    private final Integer distance;
    /**
     * The fingerprint of the derived image.
     * 
     */
    private final FingerprintResponse fingerprint;
    /**
     * This contains layer-specific metadata, if populated it has length "distance" and is ordered with [distance] being the layer immediately following the base image and [1] being the final layer.
     * 
     */
    private final List<LayerResponse> layerInfo;

    @OutputCustomType.Constructor({"baseResourceUrl","distance","fingerprint","layerInfo"})
    private ImageOccurrenceResponse(
        String baseResourceUrl,
        Integer distance,
        FingerprintResponse fingerprint,
        List<LayerResponse> layerInfo) {
        this.baseResourceUrl = Objects.requireNonNull(baseResourceUrl);
        this.distance = Objects.requireNonNull(distance);
        this.fingerprint = Objects.requireNonNull(fingerprint);
        this.layerInfo = Objects.requireNonNull(layerInfo);
    }

    /**
     * This contains the base image URL for the derived image occurrence.
     * 
     */
    public String getBaseResourceUrl() {
        return this.baseResourceUrl;
    }
    /**
     * The number of layers by which this image differs from the associated image basis.
     * 
     */
    public Integer getDistance() {
        return this.distance;
    }
    /**
     * The fingerprint of the derived image.
     * 
     */
    public FingerprintResponse getFingerprint() {
        return this.fingerprint;
    }
    /**
     * This contains layer-specific metadata, if populated it has length "distance" and is ordered with [distance] being the layer immediately following the base image and [1] being the final layer.
     * 
     */
    public List<LayerResponse> getLayerInfo() {
        return this.layerInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageOccurrenceResponse defaults) {
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

        public Builder(ImageOccurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseResourceUrl = defaults.baseResourceUrl;
    	      this.distance = defaults.distance;
    	      this.fingerprint = defaults.fingerprint;
    	      this.layerInfo = defaults.layerInfo;
        }

        public Builder setBaseResourceUrl(String baseResourceUrl) {
            this.baseResourceUrl = Objects.requireNonNull(baseResourceUrl);
            return this;
        }

        public Builder setDistance(Integer distance) {
            this.distance = Objects.requireNonNull(distance);
            return this;
        }

        public Builder setFingerprint(FingerprintResponse fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }

        public Builder setLayerInfo(List<LayerResponse> layerInfo) {
            this.layerInfo = Objects.requireNonNull(layerInfo);
            return this;
        }
        public ImageOccurrenceResponse build() {
            return new ImageOccurrenceResponse(baseResourceUrl, distance, fingerprint, layerInfo);
        }
    }
}
