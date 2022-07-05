// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.containeranalysis.v1.outputs.VersionResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DetailResponse {
    /**
     * @return The [CPE URI](https://cpe.mitre.org/specification/) this vulnerability affects.
     * 
     */
    private final String affectedCpeUri;
    /**
     * @return The package this vulnerability affects.
     * 
     */
    private final String affectedPackage;
    /**
     * @return The version number at the end of an interval in which this vulnerability exists. A vulnerability can affect a package between version numbers that are disjoint sets of intervals (example: [1.0.0-1.1.0], [2.4.6-2.4.8] and [4.5.6-4.6.8]) each of which will be represented in its own Detail. If a specific affected version is provided by a vulnerability database, affected_version_start and affected_version_end will be the same in that Detail.
     * 
     */
    private final VersionResponse affectedVersionEnd;
    /**
     * @return The version number at the start of an interval in which this vulnerability exists. A vulnerability can affect a package between version numbers that are disjoint sets of intervals (example: [1.0.0-1.1.0], [2.4.6-2.4.8] and [4.5.6-4.6.8]) each of which will be represented in its own Detail. If a specific affected version is provided by a vulnerability database, affected_version_start and affected_version_end will be the same in that Detail.
     * 
     */
    private final VersionResponse affectedVersionStart;
    /**
     * @return A vendor-specific description of this vulnerability.
     * 
     */
    private final String description;
    /**
     * @return The distro recommended [CPE URI](https://cpe.mitre.org/specification/) to update to that contains a fix for this vulnerability. It is possible for this to be different from the affected_cpe_uri.
     * 
     */
    private final String fixedCpeUri;
    /**
     * @return The distro recommended package to update to that contains a fix for this vulnerability. It is possible for this to be different from the affected_package.
     * 
     */
    private final String fixedPackage;
    /**
     * @return The distro recommended version to update to that contains a fix for this vulnerability. Setting this to VersionKind.MAXIMUM means no such version is yet available.
     * 
     */
    private final VersionResponse fixedVersion;
    /**
     * @return Whether this detail is obsolete. Occurrences are expected not to point to obsolete details.
     * 
     */
    private final Boolean isObsolete;
    /**
     * @return The type of package; whether native or non native (e.g., ruby gems, node.js packages, etc.).
     * 
     */
    private final String packageType;
    /**
     * @return The distro assigned severity of this vulnerability.
     * 
     */
    private final String severityName;
    /**
     * @return The source from which the information in this Detail was obtained.
     * 
     */
    private final String source;
    /**
     * @return The time this information was last changed at the source. This is an upstream timestamp from the underlying information source - e.g. Ubuntu security tracker.
     * 
     */
    private final String sourceUpdateTime;
    /**
     * @return The name of the vendor of the product.
     * 
     */
    private final String vendor;

    @CustomType.Constructor
    private DetailResponse(
        @CustomType.Parameter("affectedCpeUri") String affectedCpeUri,
        @CustomType.Parameter("affectedPackage") String affectedPackage,
        @CustomType.Parameter("affectedVersionEnd") VersionResponse affectedVersionEnd,
        @CustomType.Parameter("affectedVersionStart") VersionResponse affectedVersionStart,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("fixedCpeUri") String fixedCpeUri,
        @CustomType.Parameter("fixedPackage") String fixedPackage,
        @CustomType.Parameter("fixedVersion") VersionResponse fixedVersion,
        @CustomType.Parameter("isObsolete") Boolean isObsolete,
        @CustomType.Parameter("packageType") String packageType,
        @CustomType.Parameter("severityName") String severityName,
        @CustomType.Parameter("source") String source,
        @CustomType.Parameter("sourceUpdateTime") String sourceUpdateTime,
        @CustomType.Parameter("vendor") String vendor) {
        this.affectedCpeUri = affectedCpeUri;
        this.affectedPackage = affectedPackage;
        this.affectedVersionEnd = affectedVersionEnd;
        this.affectedVersionStart = affectedVersionStart;
        this.description = description;
        this.fixedCpeUri = fixedCpeUri;
        this.fixedPackage = fixedPackage;
        this.fixedVersion = fixedVersion;
        this.isObsolete = isObsolete;
        this.packageType = packageType;
        this.severityName = severityName;
        this.source = source;
        this.sourceUpdateTime = sourceUpdateTime;
        this.vendor = vendor;
    }

    /**
     * @return The [CPE URI](https://cpe.mitre.org/specification/) this vulnerability affects.
     * 
     */
    public String affectedCpeUri() {
        return this.affectedCpeUri;
    }
    /**
     * @return The package this vulnerability affects.
     * 
     */
    public String affectedPackage() {
        return this.affectedPackage;
    }
    /**
     * @return The version number at the end of an interval in which this vulnerability exists. A vulnerability can affect a package between version numbers that are disjoint sets of intervals (example: [1.0.0-1.1.0], [2.4.6-2.4.8] and [4.5.6-4.6.8]) each of which will be represented in its own Detail. If a specific affected version is provided by a vulnerability database, affected_version_start and affected_version_end will be the same in that Detail.
     * 
     */
    public VersionResponse affectedVersionEnd() {
        return this.affectedVersionEnd;
    }
    /**
     * @return The version number at the start of an interval in which this vulnerability exists. A vulnerability can affect a package between version numbers that are disjoint sets of intervals (example: [1.0.0-1.1.0], [2.4.6-2.4.8] and [4.5.6-4.6.8]) each of which will be represented in its own Detail. If a specific affected version is provided by a vulnerability database, affected_version_start and affected_version_end will be the same in that Detail.
     * 
     */
    public VersionResponse affectedVersionStart() {
        return this.affectedVersionStart;
    }
    /**
     * @return A vendor-specific description of this vulnerability.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The distro recommended [CPE URI](https://cpe.mitre.org/specification/) to update to that contains a fix for this vulnerability. It is possible for this to be different from the affected_cpe_uri.
     * 
     */
    public String fixedCpeUri() {
        return this.fixedCpeUri;
    }
    /**
     * @return The distro recommended package to update to that contains a fix for this vulnerability. It is possible for this to be different from the affected_package.
     * 
     */
    public String fixedPackage() {
        return this.fixedPackage;
    }
    /**
     * @return The distro recommended version to update to that contains a fix for this vulnerability. Setting this to VersionKind.MAXIMUM means no such version is yet available.
     * 
     */
    public VersionResponse fixedVersion() {
        return this.fixedVersion;
    }
    /**
     * @return Whether this detail is obsolete. Occurrences are expected not to point to obsolete details.
     * 
     */
    public Boolean isObsolete() {
        return this.isObsolete;
    }
    /**
     * @return The type of package; whether native or non native (e.g., ruby gems, node.js packages, etc.).
     * 
     */
    public String packageType() {
        return this.packageType;
    }
    /**
     * @return The distro assigned severity of this vulnerability.
     * 
     */
    public String severityName() {
        return this.severityName;
    }
    /**
     * @return The source from which the information in this Detail was obtained.
     * 
     */
    public String source() {
        return this.source;
    }
    /**
     * @return The time this information was last changed at the source. This is an upstream timestamp from the underlying information source - e.g. Ubuntu security tracker.
     * 
     */
    public String sourceUpdateTime() {
        return this.sourceUpdateTime;
    }
    /**
     * @return The name of the vendor of the product.
     * 
     */
    public String vendor() {
        return this.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetailResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String affectedCpeUri;
        private String affectedPackage;
        private VersionResponse affectedVersionEnd;
        private VersionResponse affectedVersionStart;
        private String description;
        private String fixedCpeUri;
        private String fixedPackage;
        private VersionResponse fixedVersion;
        private Boolean isObsolete;
        private String packageType;
        private String severityName;
        private String source;
        private String sourceUpdateTime;
        private String vendor;

        public Builder() {
    	      // Empty
        }

        public Builder(DetailResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.affectedCpeUri = defaults.affectedCpeUri;
    	      this.affectedPackage = defaults.affectedPackage;
    	      this.affectedVersionEnd = defaults.affectedVersionEnd;
    	      this.affectedVersionStart = defaults.affectedVersionStart;
    	      this.description = defaults.description;
    	      this.fixedCpeUri = defaults.fixedCpeUri;
    	      this.fixedPackage = defaults.fixedPackage;
    	      this.fixedVersion = defaults.fixedVersion;
    	      this.isObsolete = defaults.isObsolete;
    	      this.packageType = defaults.packageType;
    	      this.severityName = defaults.severityName;
    	      this.source = defaults.source;
    	      this.sourceUpdateTime = defaults.sourceUpdateTime;
    	      this.vendor = defaults.vendor;
        }

        public Builder affectedCpeUri(String affectedCpeUri) {
            this.affectedCpeUri = Objects.requireNonNull(affectedCpeUri);
            return this;
        }
        public Builder affectedPackage(String affectedPackage) {
            this.affectedPackage = Objects.requireNonNull(affectedPackage);
            return this;
        }
        public Builder affectedVersionEnd(VersionResponse affectedVersionEnd) {
            this.affectedVersionEnd = Objects.requireNonNull(affectedVersionEnd);
            return this;
        }
        public Builder affectedVersionStart(VersionResponse affectedVersionStart) {
            this.affectedVersionStart = Objects.requireNonNull(affectedVersionStart);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder fixedCpeUri(String fixedCpeUri) {
            this.fixedCpeUri = Objects.requireNonNull(fixedCpeUri);
            return this;
        }
        public Builder fixedPackage(String fixedPackage) {
            this.fixedPackage = Objects.requireNonNull(fixedPackage);
            return this;
        }
        public Builder fixedVersion(VersionResponse fixedVersion) {
            this.fixedVersion = Objects.requireNonNull(fixedVersion);
            return this;
        }
        public Builder isObsolete(Boolean isObsolete) {
            this.isObsolete = Objects.requireNonNull(isObsolete);
            return this;
        }
        public Builder packageType(String packageType) {
            this.packageType = Objects.requireNonNull(packageType);
            return this;
        }
        public Builder severityName(String severityName) {
            this.severityName = Objects.requireNonNull(severityName);
            return this;
        }
        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder sourceUpdateTime(String sourceUpdateTime) {
            this.sourceUpdateTime = Objects.requireNonNull(sourceUpdateTime);
            return this;
        }
        public Builder vendor(String vendor) {
            this.vendor = Objects.requireNonNull(vendor);
            return this;
        }        public DetailResponse build() {
            return new DetailResponse(affectedCpeUri, affectedPackage, affectedVersionEnd, affectedVersionStart, description, fixedCpeUri, fixedPackage, fixedVersion, isObsolete, packageType, severityName, source, sourceUpdateTime, vendor);
        }
    }
}
