// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * Specifies the selection and config of software inside the cluster.
 * 
 */
public final class SoftwareConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final SoftwareConfigResponse Empty = new SoftwareConfigResponse();

    /**
     * Optional. The version of software inside the cluster. It must be one of the supported Dataproc Versions (https://cloud.google.com/dataproc/docs/concepts/versioning/dataproc-versions#supported_dataproc_versions), such as "1.2" (including a subminor version, such as "1.2.29"), or the "preview" version (https://cloud.google.com/dataproc/docs/concepts/versioning/dataproc-versions#other_versions). If unspecified, it defaults to the latest Debian version.
     * 
     */
    @Import(name="imageVersion", required=true)
      private final String imageVersion;

    public String getImageVersion() {
        return this.imageVersion;
    }

    /**
     * Optional. The set of components to activate on the cluster.
     * 
     */
    @Import(name="optionalComponents", required=true)
      private final List<String> optionalComponents;

    public List<String> getOptionalComponents() {
        return this.optionalComponents;
    }

    /**
     * Optional. The properties to set on daemon config files.Property keys are specified in prefix:property format, for example core:hadoop.tmp.dir. The following are supported prefixes and their mappings: capacity-scheduler: capacity-scheduler.xml core: core-site.xml distcp: distcp-default.xml hdfs: hdfs-site.xml hive: hive-site.xml mapred: mapred-site.xml pig: pig.properties spark: spark-defaults.conf yarn: yarn-site.xmlFor more information, see Cluster properties (https://cloud.google.com/dataproc/docs/concepts/cluster-properties).
     * 
     */
    @Import(name="properties", required=true)
      private final Map<String,String> properties;

    public Map<String,String> getProperties() {
        return this.properties;
    }

    public SoftwareConfigResponse(
        String imageVersion,
        List<String> optionalComponents,
        Map<String,String> properties) {
        this.imageVersion = Objects.requireNonNull(imageVersion, "expected parameter 'imageVersion' to be non-null");
        this.optionalComponents = Objects.requireNonNull(optionalComponents, "expected parameter 'optionalComponents' to be non-null");
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
    }

    private SoftwareConfigResponse() {
        this.imageVersion = null;
        this.optionalComponents = List.of();
        this.properties = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SoftwareConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String imageVersion;
        private List<String> optionalComponents;
        private Map<String,String> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(SoftwareConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageVersion = defaults.imageVersion;
    	      this.optionalComponents = defaults.optionalComponents;
    	      this.properties = defaults.properties;
        }

        public Builder imageVersion(String imageVersion) {
            this.imageVersion = Objects.requireNonNull(imageVersion);
            return this;
        }

        public Builder optionalComponents(List<String> optionalComponents) {
            this.optionalComponents = Objects.requireNonNull(optionalComponents);
            return this;
        }

        public Builder properties(Map<String,String> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public SoftwareConfigResponse build() {
            return new SoftwareConfigResponse(imageVersion, optionalComponents, properties);
        }
    }
}
