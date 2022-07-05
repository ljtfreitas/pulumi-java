// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VersionResponse {
    /**
     * @return Used to correct mistakes in the version numbering scheme.
     * 
     */
    private final Integer epoch;
    /**
     * @return Whether this version is vulnerable, when defining the version bounds. For example, if the minimum version is 2.0, inclusive=true would say 2.0 is vulnerable, while inclusive=false would say it&#39;s not
     * 
     */
    private final Boolean inclusive;
    /**
     * @return Distinguish between sentinel MIN/MAX versions and normal versions. If kind is not NORMAL, then the other fields are ignored.
     * 
     */
    private final String kind;
    /**
     * @return The main part of the version name.
     * 
     */
    private final String name;
    /**
     * @return The iteration of the package build from the above version.
     * 
     */
    private final String revision;

    @CustomType.Constructor
    private VersionResponse(
        @CustomType.Parameter("epoch") Integer epoch,
        @CustomType.Parameter("inclusive") Boolean inclusive,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("revision") String revision) {
        this.epoch = epoch;
        this.inclusive = inclusive;
        this.kind = kind;
        this.name = name;
        this.revision = revision;
    }

    /**
     * @return Used to correct mistakes in the version numbering scheme.
     * 
     */
    public Integer epoch() {
        return this.epoch;
    }
    /**
     * @return Whether this version is vulnerable, when defining the version bounds. For example, if the minimum version is 2.0, inclusive=true would say 2.0 is vulnerable, while inclusive=false would say it&#39;s not
     * 
     */
    public Boolean inclusive() {
        return this.inclusive;
    }
    /**
     * @return Distinguish between sentinel MIN/MAX versions and normal versions. If kind is not NORMAL, then the other fields are ignored.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return The main part of the version name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The iteration of the package build from the above version.
     * 
     */
    public String revision() {
        return this.revision;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VersionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer epoch;
        private Boolean inclusive;
        private String kind;
        private String name;
        private String revision;

        public Builder() {
    	      // Empty
        }

        public Builder(VersionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.epoch = defaults.epoch;
    	      this.inclusive = defaults.inclusive;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.revision = defaults.revision;
        }

        public Builder epoch(Integer epoch) {
            this.epoch = Objects.requireNonNull(epoch);
            return this;
        }
        public Builder inclusive(Boolean inclusive) {
            this.inclusive = Objects.requireNonNull(inclusive);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder revision(String revision) {
            this.revision = Objects.requireNonNull(revision);
            return this;
        }        public VersionResponse build() {
            return new VersionResponse(epoch, inclusive, kind, name, revision);
        }
    }
}
