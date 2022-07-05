// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CisBenchmarkResponse {
    /**
     * @return The profile level of this CIS benchmark check.
     * 
     */
    private final Integer profileLevel;
    /**
     * @return The severity level of this CIS benchmark check.
     * 
     */
    private final String severity;

    @CustomType.Constructor
    private CisBenchmarkResponse(
        @CustomType.Parameter("profileLevel") Integer profileLevel,
        @CustomType.Parameter("severity") String severity) {
        this.profileLevel = profileLevel;
        this.severity = severity;
    }

    /**
     * @return The profile level of this CIS benchmark check.
     * 
     */
    public Integer profileLevel() {
        return this.profileLevel;
    }
    /**
     * @return The severity level of this CIS benchmark check.
     * 
     */
    public String severity() {
        return this.severity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CisBenchmarkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer profileLevel;
        private String severity;

        public Builder() {
    	      // Empty
        }

        public Builder(CisBenchmarkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.profileLevel = defaults.profileLevel;
    	      this.severity = defaults.severity;
        }

        public Builder profileLevel(Integer profileLevel) {
            this.profileLevel = Objects.requireNonNull(profileLevel);
            return this;
        }
        public Builder severity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }        public CisBenchmarkResponse build() {
            return new CisBenchmarkResponse(profileLevel, severity);
        }
    }
}
