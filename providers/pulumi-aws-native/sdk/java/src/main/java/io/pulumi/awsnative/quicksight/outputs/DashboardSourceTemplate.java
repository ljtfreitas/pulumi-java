// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.awsnative.quicksight.outputs.DashboardDataSetReference;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class DashboardSourceTemplate {
    /**
     * <p>The Amazon Resource Name (ARN) of the resource.</p>
     * 
     */
    private final String arn;
    /**
     * <p>Dataset references.</p>
     * 
     */
    private final List<DashboardDataSetReference> dataSetReferences;

    @OutputCustomType.Constructor({"arn","dataSetReferences"})
    private DashboardSourceTemplate(
        String arn,
        List<DashboardDataSetReference> dataSetReferences) {
        this.arn = Objects.requireNonNull(arn);
        this.dataSetReferences = Objects.requireNonNull(dataSetReferences);
    }

    /**
     * <p>The Amazon Resource Name (ARN) of the resource.</p>
     * 
     */
    public String getArn() {
        return this.arn;
    }
    /**
     * <p>Dataset references.</p>
     * 
     */
    public List<DashboardDataSetReference> getDataSetReferences() {
        return this.dataSetReferences;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardSourceTemplate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private List<DashboardDataSetReference> dataSetReferences;

        public Builder() {
    	      // Empty
        }

        public Builder(DashboardSourceTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.dataSetReferences = defaults.dataSetReferences;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setDataSetReferences(List<DashboardDataSetReference> dataSetReferences) {
            this.dataSetReferences = Objects.requireNonNull(dataSetReferences);
            return this;
        }
        public DashboardSourceTemplate build() {
            return new DashboardSourceTemplate(arn, dataSetReferences);
        }
    }
}
