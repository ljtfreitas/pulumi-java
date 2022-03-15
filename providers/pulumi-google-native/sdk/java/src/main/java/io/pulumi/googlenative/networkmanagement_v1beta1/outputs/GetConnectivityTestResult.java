// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.networkmanagement_v1beta1.outputs.EndpointResponse;
import io.pulumi.googlenative.networkmanagement_v1beta1.outputs.ProbingDetailsResponse;
import io.pulumi.googlenative.networkmanagement_v1beta1.outputs.ReachabilityDetailsResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetConnectivityTestResult {
    /**
     * The time the test was created.
     * 
     */
    private final String createTime;
    /**
     * The user-supplied description of the Connectivity Test. Maximum of 512 characters.
     * 
     */
    private final String description;
    /**
     * Destination specification of the Connectivity Test. You can use a combination of destination IP address, Compute Engine VM instance, or VPC network to uniquely identify the destination location. Even if the destination IP address is not unique, the source IP location is unique. Usually, the analysis can infer the destination endpoint from route information. If the destination you specify is a VM instance and the instance has multiple network interfaces, then you must also specify either a destination IP address or VPC network to identify the destination interface. A reachability analysis proceeds even if the destination location is ambiguous. However, the result can include endpoints that you don't intend to test.
     * 
     */
    private final EndpointResponse destination;
    /**
     * The display name of a Connectivity Test.
     * 
     */
    private final String displayName;
    /**
     * Resource labels to represent user-provided metadata.
     * 
     */
    private final Map<String,String> labels;
    /**
     * Unique name of the resource using the form: `projects/{project_id}/locations/global/connectivityTests/{test}`
     * 
     */
    private final String name;
    /**
     * The probing details of this test from the latest run, present for applicable tests only. The details are updated when creating a new test, updating an existing test, or triggering a one-time rerun of an existing test.
     * 
     */
    private final ProbingDetailsResponse probingDetails;
    /**
     * IP Protocol of the test. When not provided, "TCP" is assumed.
     * 
     */
    private final String protocol;
    /**
     * The reachability details of this test from the latest run. The details are updated when creating a new test, updating an existing test, or triggering a one-time rerun of an existing test.
     * 
     */
    private final ReachabilityDetailsResponse reachabilityDetails;
    /**
     * Other projects that may be relevant for reachability analysis. This is applicable to scenarios where a test can cross project boundaries.
     * 
     */
    private final List<String> relatedProjects;
    /**
     * Source specification of the Connectivity Test. You can use a combination of source IP address, virtual machine (VM) instance, or Compute Engine network to uniquely identify the source location. Examples: If the source IP address is an internal IP address within a Google Cloud Virtual Private Cloud (VPC) network, then you must also specify the VPC network. Otherwise, specify the VM instance, which already contains its internal IP address and VPC network information. If the source of the test is within an on-premises network, then you must provide the destination VPC network. If the source endpoint is a Compute Engine VM instance with multiple network interfaces, the instance itself is not sufficient to identify the endpoint. So, you must also specify the source IP address or VPC network. A reachability analysis proceeds even if the source location is ambiguous. However, the test result may include endpoints that you don't intend to test.
     * 
     */
    private final EndpointResponse source;
    /**
     * The time the test's configuration was updated.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetConnectivityTestResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("destination") EndpointResponse destination,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("probingDetails") ProbingDetailsResponse probingDetails,
        @CustomType.Parameter("protocol") String protocol,
        @CustomType.Parameter("reachabilityDetails") ReachabilityDetailsResponse reachabilityDetails,
        @CustomType.Parameter("relatedProjects") List<String> relatedProjects,
        @CustomType.Parameter("source") EndpointResponse source,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.description = description;
        this.destination = destination;
        this.displayName = displayName;
        this.labels = labels;
        this.name = name;
        this.probingDetails = probingDetails;
        this.protocol = protocol;
        this.reachabilityDetails = reachabilityDetails;
        this.relatedProjects = relatedProjects;
        this.source = source;
        this.updateTime = updateTime;
    }

    /**
     * The time the test was created.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The user-supplied description of the Connectivity Test. Maximum of 512 characters.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Destination specification of the Connectivity Test. You can use a combination of destination IP address, Compute Engine VM instance, or VPC network to uniquely identify the destination location. Even if the destination IP address is not unique, the source IP location is unique. Usually, the analysis can infer the destination endpoint from route information. If the destination you specify is a VM instance and the instance has multiple network interfaces, then you must also specify either a destination IP address or VPC network to identify the destination interface. A reachability analysis proceeds even if the destination location is ambiguous. However, the result can include endpoints that you don't intend to test.
     * 
    */
    public EndpointResponse getDestination() {
        return this.destination;
    }
    /**
     * The display name of a Connectivity Test.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Resource labels to represent user-provided metadata.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * Unique name of the resource using the form: `projects/{project_id}/locations/global/connectivityTests/{test}`
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The probing details of this test from the latest run, present for applicable tests only. The details are updated when creating a new test, updating an existing test, or triggering a one-time rerun of an existing test.
     * 
    */
    public ProbingDetailsResponse getProbingDetails() {
        return this.probingDetails;
    }
    /**
     * IP Protocol of the test. When not provided, "TCP" is assumed.
     * 
    */
    public String getProtocol() {
        return this.protocol;
    }
    /**
     * The reachability details of this test from the latest run. The details are updated when creating a new test, updating an existing test, or triggering a one-time rerun of an existing test.
     * 
    */
    public ReachabilityDetailsResponse getReachabilityDetails() {
        return this.reachabilityDetails;
    }
    /**
     * Other projects that may be relevant for reachability analysis. This is applicable to scenarios where a test can cross project boundaries.
     * 
    */
    public List<String> getRelatedProjects() {
        return this.relatedProjects;
    }
    /**
     * Source specification of the Connectivity Test. You can use a combination of source IP address, virtual machine (VM) instance, or Compute Engine network to uniquely identify the source location. Examples: If the source IP address is an internal IP address within a Google Cloud Virtual Private Cloud (VPC) network, then you must also specify the VPC network. Otherwise, specify the VM instance, which already contains its internal IP address and VPC network information. If the source of the test is within an on-premises network, then you must provide the destination VPC network. If the source endpoint is a Compute Engine VM instance with multiple network interfaces, the instance itself is not sufficient to identify the endpoint. So, you must also specify the source IP address or VPC network. A reachability analysis proceeds even if the source location is ambiguous. However, the test result may include endpoints that you don't intend to test.
     * 
    */
    public EndpointResponse getSource() {
        return this.source;
    }
    /**
     * The time the test's configuration was updated.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectivityTestResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private EndpointResponse destination;
        private String displayName;
        private Map<String,String> labels;
        private String name;
        private ProbingDetailsResponse probingDetails;
        private String protocol;
        private ReachabilityDetailsResponse reachabilityDetails;
        private List<String> relatedProjects;
        private EndpointResponse source;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectivityTestResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.destination = defaults.destination;
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.probingDetails = defaults.probingDetails;
    	      this.protocol = defaults.protocol;
    	      this.reachabilityDetails = defaults.reachabilityDetails;
    	      this.relatedProjects = defaults.relatedProjects;
    	      this.source = defaults.source;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder destination(EndpointResponse destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder probingDetails(ProbingDetailsResponse probingDetails) {
            this.probingDetails = Objects.requireNonNull(probingDetails);
            return this;
        }

        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder reachabilityDetails(ReachabilityDetailsResponse reachabilityDetails) {
            this.reachabilityDetails = Objects.requireNonNull(reachabilityDetails);
            return this;
        }

        public Builder relatedProjects(List<String> relatedProjects) {
            this.relatedProjects = Objects.requireNonNull(relatedProjects);
            return this;
        }

        public Builder source(EndpointResponse source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetConnectivityTestResult build() {
            return new GetConnectivityTestResult(createTime, description, destination, displayName, labels, name, probingDetails, protocol, reachabilityDetails, relatedProjects, source, updateTime);
        }
    }
}
