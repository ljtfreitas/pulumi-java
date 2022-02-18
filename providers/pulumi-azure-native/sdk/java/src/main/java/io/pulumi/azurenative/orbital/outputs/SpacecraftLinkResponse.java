// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.orbital.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SpacecraftLinkResponse {
    /**
     * Bandwidth in MHz
     * 
     */
    private final Double bandwidthMHz;
    /**
     * Center Frequency in MHz
     * 
     */
    private final Double centerFrequencyMHz;
    /**
     * Direction (uplink or downlink)
     * 
     */
    private final String direction;
    /**
     * polarization. eg (RHCP, LHCP)
     * 
     */
    private final String polarization;

    @OutputCustomType.Constructor({"bandwidthMHz","centerFrequencyMHz","direction","polarization"})
    private SpacecraftLinkResponse(
        Double bandwidthMHz,
        Double centerFrequencyMHz,
        String direction,
        String polarization) {
        this.bandwidthMHz = Objects.requireNonNull(bandwidthMHz);
        this.centerFrequencyMHz = Objects.requireNonNull(centerFrequencyMHz);
        this.direction = Objects.requireNonNull(direction);
        this.polarization = Objects.requireNonNull(polarization);
    }

    /**
     * Bandwidth in MHz
     * 
     */
    public Double getBandwidthMHz() {
        return this.bandwidthMHz;
    }
    /**
     * Center Frequency in MHz
     * 
     */
    public Double getCenterFrequencyMHz() {
        return this.centerFrequencyMHz;
    }
    /**
     * Direction (uplink or downlink)
     * 
     */
    public String getDirection() {
        return this.direction;
    }
    /**
     * polarization. eg (RHCP, LHCP)
     * 
     */
    public String getPolarization() {
        return this.polarization;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpacecraftLinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double bandwidthMHz;
        private Double centerFrequencyMHz;
        private String direction;
        private String polarization;

        public Builder() {
    	      // Empty
        }

        public Builder(SpacecraftLinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidthMHz = defaults.bandwidthMHz;
    	      this.centerFrequencyMHz = defaults.centerFrequencyMHz;
    	      this.direction = defaults.direction;
    	      this.polarization = defaults.polarization;
        }

        public Builder setBandwidthMHz(Double bandwidthMHz) {
            this.bandwidthMHz = Objects.requireNonNull(bandwidthMHz);
            return this;
        }

        public Builder setCenterFrequencyMHz(Double centerFrequencyMHz) {
            this.centerFrequencyMHz = Objects.requireNonNull(centerFrequencyMHz);
            return this;
        }

        public Builder setDirection(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }

        public Builder setPolarization(String polarization) {
            this.polarization = Objects.requireNonNull(polarization);
            return this;
        }

        public SpacecraftLinkResponse build() {
            return new SpacecraftLinkResponse(bandwidthMHz, centerFrequencyMHz, direction, polarization);
        }
    }
}
