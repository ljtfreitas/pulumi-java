// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.awsnative.quicksight.outputs.TemplateDataSetReference;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class TemplateSourceAnalysis {
    /**
     * <p>The Amazon Resource Name (ARN) of the resource.</p>
     * 
     */
    private final String arn;
    /**
     * <p>A structure containing information about the dataset references used as placeholders
     *             in the template.</p>
     * 
     */
    private final List<TemplateDataSetReference> dataSetReferences;

    @OutputCustomType.Constructor
    private TemplateSourceAnalysis(
        @OutputCustomType.Parameter("arn") String arn,
        @OutputCustomType.Parameter("dataSetReferences") List<TemplateDataSetReference> dataSetReferences) {
        this.arn = arn;
        this.dataSetReferences = dataSetReferences;
    }

    /**
     * <p>The Amazon Resource Name (ARN) of the resource.</p>
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * <p>A structure containing information about the dataset references used as placeholders
     *             in the template.</p>
     * 
    */
    public List<TemplateDataSetReference> getDataSetReferences() {
        return this.dataSetReferences;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateSourceAnalysis defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private List<TemplateDataSetReference> dataSetReferences;

        public Builder() {
    	      // Empty
        }

        public Builder(TemplateSourceAnalysis defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.dataSetReferences = defaults.dataSetReferences;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setDataSetReferences(List<TemplateDataSetReference> dataSetReferences) {
            this.dataSetReferences = Objects.requireNonNull(dataSetReferences);
            return this;
        }
        public TemplateSourceAnalysis build() {
            return new TemplateSourceAnalysis(arn, dataSetReferences);
        }
    }
}
