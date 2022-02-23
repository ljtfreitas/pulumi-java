// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * A compliance check that is a CIS benchmark.
 * 
 */
public final class CisBenchmarkResponse extends io.pulumi.resources.InvokeArgs {

    public static final CisBenchmarkResponse Empty = new CisBenchmarkResponse();

    /**
     * The profile level of this CIS benchmark check.
     * 
     */
    @InputImport(name="profileLevel", required=true)
      private final Integer profileLevel;

    public Integer getProfileLevel() {
        return this.profileLevel;
    }

    /**
     * The severity level of this CIS benchmark check.
     * 
     */
    @InputImport(name="severity", required=true)
      private final String severity;

    public String getSeverity() {
        return this.severity;
    }

    public CisBenchmarkResponse(
        Integer profileLevel,
        String severity) {
        this.profileLevel = Objects.requireNonNull(profileLevel, "expected parameter 'profileLevel' to be non-null");
        this.severity = Objects.requireNonNull(severity, "expected parameter 'severity' to be non-null");
    }

    private CisBenchmarkResponse() {
        this.profileLevel = null;
        this.severity = null;
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

        public Builder setProfileLevel(Integer profileLevel) {
            this.profileLevel = Objects.requireNonNull(profileLevel);
            return this;
        }

        public Builder setSeverity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }
        public CisBenchmarkResponse build() {
            return new CisBenchmarkResponse(profileLevel, severity);
        }
    }
}
