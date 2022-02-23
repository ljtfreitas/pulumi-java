// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mq.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetBrokerConfiguration {
    private final String id;
    private final Integer revision;

    @OutputCustomType.Constructor({"id","revision"})
    private GetBrokerConfiguration(
        String id,
        Integer revision) {
        this.id = Objects.requireNonNull(id);
        this.revision = Objects.requireNonNull(revision);
    }

    public String getId() {
        return this.id;
    }
    public Integer getRevision() {
        return this.revision;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBrokerConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private Integer revision;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBrokerConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.revision = defaults.revision;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setRevision(Integer revision) {
            this.revision = Objects.requireNonNull(revision);
            return this;
        }
        public GetBrokerConfiguration build() {
            return new GetBrokerConfiguration(id, revision);
        }
    }
}