// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.eventarc_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.eventarc_v1beta1.outputs.DestinationResponse;
import io.pulumi.googlenative.eventarc_v1beta1.outputs.MatchingCriteriaResponse;
import io.pulumi.googlenative.eventarc_v1beta1.outputs.TransportResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetTriggerResult {
    private final String createTime;
    private final DestinationResponse destination;
    private final String etag;
    private final Map<String,String> labels;
    private final List<MatchingCriteriaResponse> matchingCriteria;
    private final String name;
    private final String serviceAccount;
    private final TransportResponse transport;
    private final String updateTime;

    @OutputCustomType.Constructor({"createTime","destination","etag","labels","matchingCriteria","name","serviceAccount","transport","updateTime"})
    private GetTriggerResult(
        String createTime,
        DestinationResponse destination,
        String etag,
        Map<String,String> labels,
        List<MatchingCriteriaResponse> matchingCriteria,
        String name,
        String serviceAccount,
        TransportResponse transport,
        String updateTime) {
        this.createTime = Objects.requireNonNull(createTime);
        this.destination = Objects.requireNonNull(destination);
        this.etag = Objects.requireNonNull(etag);
        this.labels = Objects.requireNonNull(labels);
        this.matchingCriteria = Objects.requireNonNull(matchingCriteria);
        this.name = Objects.requireNonNull(name);
        this.serviceAccount = Objects.requireNonNull(serviceAccount);
        this.transport = Objects.requireNonNull(transport);
        this.updateTime = Objects.requireNonNull(updateTime);
    }

    public String getCreateTime() {
        return this.createTime;
    }
    public DestinationResponse getDestination() {
        return this.destination;
    }
    public String getEtag() {
        return this.etag;
    }
    public Map<String,String> getLabels() {
        return this.labels;
    }
    public List<MatchingCriteriaResponse> getMatchingCriteria() {
        return this.matchingCriteria;
    }
    public String getName() {
        return this.name;
    }
    public String getServiceAccount() {
        return this.serviceAccount;
    }
    public TransportResponse getTransport() {
        return this.transport;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTriggerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private DestinationResponse destination;
        private String etag;
        private Map<String,String> labels;
        private List<MatchingCriteriaResponse> matchingCriteria;
        private String name;
        private String serviceAccount;
        private TransportResponse transport;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTriggerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.destination = defaults.destination;
    	      this.etag = defaults.etag;
    	      this.labels = defaults.labels;
    	      this.matchingCriteria = defaults.matchingCriteria;
    	      this.name = defaults.name;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.transport = defaults.transport;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDestination(DestinationResponse destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setMatchingCriteria(List<MatchingCriteriaResponse> matchingCriteria) {
            this.matchingCriteria = Objects.requireNonNull(matchingCriteria);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setServiceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }

        public Builder setTransport(TransportResponse transport) {
            this.transport = Objects.requireNonNull(transport);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public GetTriggerResult build() {
            return new GetTriggerResult(createTime, destination, etag, labels, matchingCriteria, name, serviceAccount, transport, updateTime);
        }
    }
}